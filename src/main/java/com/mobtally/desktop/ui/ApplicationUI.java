package com.mobtally.desktop.ui;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

@Component
public class ApplicationUI extends JFrame implements InitializingBean {

    @Autowired
    public ApplicationUI() {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        initUI();
    }

    private void initUI() {
        setTitle("Tally Sync Desktop App");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label = new JLabel("Hello World Swing");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));

        label.setText("Hello World Swing");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        add(label);
        setVisible(true);
    }
}
