package com.mobtally.desktop;

import com.mobtally.desktop.modules.company.service.CompanyReadPlatformService;
import com.mobtally.desktop.modules.company.service.CompanyReadPlatformServiceImpl;
import com.mobtally.desktop.modules.company.view.CompanyView;
import com.mobtally.desktop.modules.company.view.CompanyViewImpl;
import com.mobtally.desktop.ui.ApplicationUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.mobtally.desktop")
@EnableAutoConfiguration(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
public class MobTallyDesktopApplication {

    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(MobTallyDesktopApplication.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
