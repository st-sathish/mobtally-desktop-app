package com.mobtally.desktop.modules.voucher.view;

import com.mobtally.desktop.modules.voucher.service.VoucherReadPlatformService;
import com.mobtally.desktop.modules.voucher.service.VoucherWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class VoucherViewImpl implements VoucherView {

    private final VoucherWritePlatformService voucherWritePlatformService;

    private final VoucherReadPlatformService voucherReadPlatformService;

    @Autowired
    public VoucherViewImpl(final VoucherReadPlatformService voucherReadPlatformService,
                           final VoucherWritePlatformService voucherWritePlatformService) {
        this.voucherReadPlatformService = voucherReadPlatformService;
        this.voucherWritePlatformService = voucherWritePlatformService;
    }

    @Override
    public void initView(JFrame jFrame) {

    }
}
