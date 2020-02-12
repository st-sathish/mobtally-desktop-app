package com.mobtally.desktop.pojo;


import com.mobtally.desktop.common.TallyRequest;
import com.mobtally.desktop.elements.Envelop;
import com.mobtally.desktop.elements.body.ExportData;
import com.mobtally.desktop.elements.body.RequestDesc;
import com.mobtally.desktop.elements.body.StaticVariable;
import com.mobtally.desktop.elements.header.Header;

import java.util.ArrayList;
import java.util.List;

public class Company extends Envelop {


    public static Company buildFindAllRequest() {
        Company company = new Company();
        Header header = new Header();
        header.setTallyRequest(TallyRequest.EXPORT.toString());
        company.setHeader(header);

        //body
        ExportData exportData = new ExportData();
        RequestDesc requestDesc = new RequestDesc();
        requestDesc.setReportName("List of Companies");
        List<StaticVariable> staticVariables = new ArrayList<>();

        StaticVariable staticVariable = new StaticVariable();
        staticVariable.setSvExportFormat("$$SysName:XML");

        staticVariables.add(staticVariable);
        requestDesc.setStaticVariables(staticVariables);
        exportData.setRequestDesc(requestDesc);
        company.setBody(exportData);
        return company;
    }
}
