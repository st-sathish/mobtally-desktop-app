package com.mobtally.desktop.modules.ledger.view;

import com.mobtally.desktop.modules.ledger.service.LedgerReadPlatformService;
import com.mobtally.desktop.modules.ledger.service.LedgerWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class LedgerViewImpl implements LedgerView {

    private final LedgerWritePlatformService ledgerWritePlatformService;

    private final LedgerReadPlatformService ledgerReadPlatformService;

    @Autowired
    public LedgerViewImpl(final LedgerReadPlatformService ledgerReadPlatformService,
                          final LedgerWritePlatformService ledgerWritePlatformService) {
        this.ledgerReadPlatformService = ledgerReadPlatformService;
        this.ledgerWritePlatformService = ledgerWritePlatformService;
    }

    @Override
    public void initView(JFrame jFrame) {

    }
}
