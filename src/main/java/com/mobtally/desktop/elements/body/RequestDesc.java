package com.mobtally.desktop.elements.body;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class RequestDesc {

    @XmlElement(name = "REPORTNAME")
    private String reportName;

    @XmlElement(name = "STATICVARIABLES")
    private List<StaticVariable> staticVariables;

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public List<StaticVariable> getStaticVariables() {
        return staticVariables;
    }

    public void setStaticVariables(List<StaticVariable> staticVariables) {
        this.staticVariables = staticVariables;
    }
}
