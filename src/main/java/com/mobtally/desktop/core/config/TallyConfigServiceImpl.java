package com.mobtally.desktop.core.config;

import com.mobtally.desktop.common.AppConstants;
import org.springframework.stereotype.Service;

@Service
public class TallyConfigServiceImpl implements TallyConfigService {

    private static int port = AppConstants.DEFAULT_TALLY_PORT;

    private static String host = AppConstants.DEFAULT_TALLY_HOST;

    @Override
    public void setTallyPort(int portNo) {
        port = portNo;
    }

    @Override
    public int getTallyPort() {
        return port;
    }

    @Override
    public void setTallyHost(String hostName) {
        host = hostName;
    }

    @Override
    public String getTallyHost() {
        return host;
    }
}
