package com.mobtally.desktop.modules.company.view;

import com.mobtally.desktop.modules.company.service.CompanyReadPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class CompanyViewImpl implements CompanyView {

    private final CompanyReadPlatformService companyReadPlatformService;

    @Autowired
    public CompanyViewImpl(final CompanyReadPlatformService companyReadPlatformService) {
        this.companyReadPlatformService = companyReadPlatformService;
    }

    @Override
    public void setView(JFrame jFrame) {

    }

    @Override
    public void doSync() {

    }
}
