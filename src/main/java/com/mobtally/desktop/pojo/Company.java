package com.mobtally.desktop.pojo;


import com.mobtally.desktop.common.TallyRequest;
import com.mobtally.desktop.elements.Envelop;
import com.mobtally.desktop.elements.body.Body;
import com.mobtally.desktop.elements.body.ExportData;
import com.mobtally.desktop.elements.body.RequestDesc;
import com.mobtally.desktop.elements.body.StaticVariable;
import com.mobtally.desktop.elements.header.Header;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "COMPANY")
public class Company extends Envelop {


    public static Company buildFindAllTallyRequest() {
        Company company = new Company();
        Header header = new Header();
        header.setTallyRequest(TallyRequest.EXPORT.toString());
        header.setVersion("1");
        header.setType("OBJECT");
        company.setHeader(header);

        //body
        Body body = new Body();
        attachExportData(body);
        company.setBody(body);
        return company;
    }

    private static void attachExportData(final Body body) {
        ExportData exportData = new ExportData();
        RequestDesc requestDesc = new RequestDesc();
        requestDesc.setReportName("List of Companies");
        List<StaticVariable> staticVariables = new ArrayList<>();

        StaticVariable staticVariable = new StaticVariable();
        staticVariable.setSvExportFormat("$$SysName:XML");

        staticVariables.add(staticVariable);
        requestDesc.setStaticVariables(staticVariables);
        exportData.setRequestDesc(requestDesc);

        body.setExportData(exportData);
    }
}
