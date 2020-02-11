package com.mobtally.desktop.modules.ledger.service;

import com.mobtally.desktop.pojo.Ledger;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LedgerReadPlatformServiceImpl implements LedgerReadPlatformService {

    @Override
    public Collection<Ledger> findAll() {
        return null;
    }
}
