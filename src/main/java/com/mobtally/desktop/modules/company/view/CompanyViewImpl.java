package com.mobtally.desktop.modules.company.view;

import com.mobtally.desktop.modules.company.service.CompanyReadPlatformService;
import com.mobtally.desktop.pojo.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.Collection;

@Component
public class CompanyViewImpl implements CompanyView, InitializingBean {

    private final CompanyReadPlatformService companyReadPlatformService;

    private static final Logger logger = LoggerFactory.getLogger(CompanyViewImpl.class);

    @Autowired
    public CompanyViewImpl(final CompanyReadPlatformService companyReadPlatformService) {
        this.companyReadPlatformService = companyReadPlatformService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("Component Registered {}", CompanyViewImpl.class.getSimpleName());
    }

    @Override
    public void initView(JFrame jFrame) {
        Collection<Company> companyCollecton = companyReadPlatformService.findAll();
        String data[][]={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};
        String column[]={"ID","NAME","SALARY"};
        final JTable jt=new JTable(data,column);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select= jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane sp=new JScrollPane(jt);
        jFrame.add(sp);
    }

    @Override
    public void doSync() {

    }
}
