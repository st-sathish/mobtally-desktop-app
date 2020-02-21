package com.mobtally.desktop.pojo;


import com.mobtally.desktop.common.TallyRequest;
import com.mobtally.desktop.elements.Envelop;
import com.mobtally.desktop.elements.TallyParser;
import com.mobtally.desktop.elements.body.Body;
import com.mobtally.desktop.elements.body.ExportData;
import com.mobtally.desktop.elements.body.RequestDesc;
import com.mobtally.desktop.elements.body.StaticVariable;
import com.mobtally.desktop.elements.header.Header;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "COMPANY")
public class Company extends Envelop {

    public static ExportData getExportData() {
        ExportData exportData = new ExportData();
        RequestDesc requestDesc = new RequestDesc();
        requestDesc.setReportName("List of Companies");
        List<StaticVariable> staticVariables = new ArrayList<>();

        StaticVariable staticVariable = new StaticVariable();
        staticVariable.setSvExportFormat("$$SysName:XML");

        staticVariables.add(staticVariable);
        requestDesc.setStaticVariables(staticVariables);
        exportData.setRequestDesc(requestDesc);

        return exportData;
    }
}
