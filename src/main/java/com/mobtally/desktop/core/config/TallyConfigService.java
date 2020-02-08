package com.mobtally.desktop.core.config;

public interface TallyConfigService {

    void setTallyPort(int port);

    int getTallyPort();

    void setTallyHost(String host);

    String getTallyHost();
}
