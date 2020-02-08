package com.mobtally.desktop;

import com.mobtally.desktop.ui.ApplicationUI;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.awt.*;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
public class MobTallyDesktopApplication {

    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(ApplicationUI.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
        // show UI
        EventQueue.invokeLater(() -> {
            var ex = context.getBean(ApplicationUI.class);
            ex.setVisible(true);
        });
    }
}
