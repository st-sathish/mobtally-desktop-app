package com.mobtally.desktop.modules.company.service;

import com.mobtally.desktop.pojo.Company;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CompanyReadPlatformServiceImpl implements CompanyReadPlatformService {

    @Override
    public Collection<Company> findAll() {
        return null;
    }
}
