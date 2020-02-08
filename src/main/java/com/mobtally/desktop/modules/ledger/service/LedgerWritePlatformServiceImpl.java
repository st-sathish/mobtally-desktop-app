package com.mobtally.desktop.modules.ledger.service;

import com.mobtally.desktop.core.client.HttpClient;
import com.mobtally.desktop.core.client.HttpClientBuilder;
import com.mobtally.desktop.modules.ledger.Ledger;
import com.mobtally.desktop.modules.voucher.Voucher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LedgerWritePlatformServiceImpl implements LedgerWritePlatformService {

    private static final Logger logger = LoggerFactory.getLogger(LedgerWritePlatformServiceImpl.class);

    @Override
    public void save(Ledger data) {
        HttpClient httpClient = new HttpClientBuilder()
                .build();
        try {
            Voucher result = (Voucher) httpClient.post(data);
        } catch (Exception e) {
            logger.error("Exception while saving voucher {}", e.getMessage());
        }
    }
}
