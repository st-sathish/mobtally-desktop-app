package com.mobtally.desktop.core.client;

public final class HttpClientBuilder {

    private String tallyXmlRequest;

    public HttpClientBuilder() {

    }

    public HttpClientBuilder setTallyXmlRequest(String tallyXmlRequest) {
        this.tallyXmlRequest = tallyXmlRequest;
        return this;
    }

    public HttpClient build() {
        return new HttpClient();
    }
}
