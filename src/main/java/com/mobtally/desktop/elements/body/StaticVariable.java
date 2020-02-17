package com.mobtally.desktop.elements.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "STATICVARIABLE")
@XmlAccessorType(XmlAccessType.FIELD)
public class StaticVariable {

    @XmlElement(name = "SVEXPORTFORMAT")
    private String svExportFormat;

    public String getSvExportFormat() {
        return svExportFormat;
    }

    public void setSvExportFormat(String svExportFormat) {
        this.svExportFormat = svExportFormat;
    }
}
