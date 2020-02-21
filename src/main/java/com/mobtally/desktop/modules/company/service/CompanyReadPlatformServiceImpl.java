package com.mobtally.desktop.modules.company.service;
import com.mobtally.desktop.elements.Envelop;
import com.mobtally.desktop.elements.TallyParser;
import com.mobtally.desktop.elements.body.ExportData;
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
        String request = TallyParser.getAsXml("EXPORTDATA", exportData);
        logger.info("Company find all request data {}", request);
        return new ArrayList<>();
    }
}
