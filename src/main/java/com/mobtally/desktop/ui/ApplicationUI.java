package com.mobtally.desktop.ui;

import com.mobtally.desktop.modules.company.view.CompanyView;
import com.mobtally.desktop.modules.company.view.CompanyViewImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ApplicationUI extends JFrame implements InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationUI.class);

    private CompanyView companyView;

    @Autowired
    public ApplicationUI(final CompanyView companyView) {
        this.companyView = companyView;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("Component Registered {}", ApplicationUI.class.getSimpleName());
        initUI();
    }

    private void initUI() {
        companyView.initView(this);
        setTitle("Tally Sync Desktop App");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
