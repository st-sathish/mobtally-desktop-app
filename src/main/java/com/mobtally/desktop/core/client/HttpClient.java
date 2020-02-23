package com.mobtally.desktop.core.client;

import com.mobtally.desktop.core.BeanUtils;
import com.mobtally.desktop.core.config.TallyConfigService;
import com.mobtally.desktop.core.utils.TallyHttpUtils;
import com.mobtally.desktop.elements.Envelop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

public class HttpClient {

    private static final Logger logger = LoggerFactory.getLogger(HttpClient.class);

    private String url;

    public HttpClient() {
        TallyConfigService tallyConfigService = BeanUtils.getBean(TallyConfigService.class);
        this.url = tallyConfigService.getTallyHost() + File.separator + tallyConfigService.getTallyPort();
        logger.info("Tally server url {}", this.url);
    }

    private HttpURLConnection createConnection() throws MalformedURLException, IOException {
        URL url = new URL(this.url);
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        connection.setDoOutput(true);
        connection.setDoInput(true);
        return (HttpURLConnection) connection;
    }

    public String get() throws Exception {
        HttpURLConnection httpConn = this.createConnection();
        httpConn.setRequestMethod( HttpMethod.GET);
        return "";
    }

    public String post(String tallyRequest) throws Exception {
        OutputStream out = null;
        BufferedReader in = null;
        HttpURLConnection httpConn = this.createConnection();
        try {
            ByteArrayInputStream bin = new ByteArrayInputStream(tallyRequest.getBytes());
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            String SOAPAction = "";

            // deep copy
            TallyHttpUtils.copy(bin, bout);

            // get bytes
            byte[] b = bout.toByteArray();

            // set http header
            this.setHttpHeader(httpConn, HttpMethod.POST, SOAPAction, b);

            out = httpConn.getOutputStream();
            out.write(b);

            InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
            in = new BufferedReader(isr);
            String inputLine = "";
            while (in.readLine() != null) {
                inputLine = in.readLine();
            }
            return inputLine;
        } catch (Exception e) {
            throw e;
        } finally {
            if(out != null) {
                out.close();
            }
            if(in != null) {
                in.close();
            }
            httpConn.disconnect();
        }
    }

    private void setHttpHeader(HttpURLConnection connection, String httpMethod, String SOAPAction, byte[] b) throws ProtocolException {
        connection.setRequestProperty("Content-Length", String.valueOf(b.length));
        connection.setRequestProperty("SOAPAction", SOAPAction);
        setHttpHeader(connection, httpMethod);
    }

    private void setHttpHeader(HttpURLConnection connection, String httpMethod) throws ProtocolException {
        connection.setRequestMethod(httpMethod);

    }
}
