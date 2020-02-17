package com.mobtally.desktop.elements.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "REQUESTDESC")
@XmlAccessorType(XmlAccessType.FIELD)
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
