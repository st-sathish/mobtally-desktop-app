package com.mobtally.desktop.modules.company.service;
import com.mobtally.desktop.common.TallyRequest;
import com.mobtally.desktop.core.client.HttpClient;
import com.mobtally.desktop.elements.Envelop;
import com.mobtally.desktop.elements.TallyParser;
import com.mobtally.desktop.elements.body.Body;
import com.mobtally.desktop.elements.body.ExportData;
import com.mobtally.desktop.elements.header.Header;
import com.mobtally.desktop.pojo.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class CompanyReadPlatformServiceImpl implements CompanyReadPlatformService {

    private static final Logger logger = LoggerFactory.getLogger(CompanyReadPlatformServiceImpl.class);

    @Override
    public Collection<Company> findAll() {
        final ExportData exportData = Company.getExportData();
        Envelop envelop = new Envelop();
        Header header = new Header();
        header.setId("1");
        header.setTallyRequest(TallyRequest.EXPORT.toString());
        Body body = new Body();
        body.setExportData(exportData);

        envelop.setHeader(header);
        envelop.setBody(body);
        String request = TallyParser.getAsXml(envelop);
        logger.info("Company find all request data {}", request);
        try {
            String response = new HttpClient().post(request);
            logger.info("Company response data {}", response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
