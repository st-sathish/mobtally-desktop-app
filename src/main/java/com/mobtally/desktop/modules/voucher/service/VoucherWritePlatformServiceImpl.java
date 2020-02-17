package com.mobtally.desktop.modules.voucher.service;

import com.mobtally.desktop.core.client.HttpClient;
import com.mobtally.desktop.core.client.HttpClientBuilder;
import com.mobtally.desktop.pojo.Voucher;
import com.mobtally.desktop.elements.Envelop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class VoucherWritePlatformServiceImpl implements VoucherWritePlatformService {

    private static final Logger logger = LoggerFactory.getLogger(VoucherWritePlatformServiceImpl.class);

    @Override
    public void save(Voucher data) {
        HttpClient httpClient = new HttpClientBuilder()
                .build();
        try {
            Envelop envelop = new Envelop();
            //envelop.setBody(data);
            Envelop result = httpClient.post(envelop);
        } catch (Exception e) {
            logger.error("Exception while saving voucher {}", e.getMessage());
        }
    }
}
