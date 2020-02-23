package com.mobtally.desktop.elements.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BODY")
@XmlAccessorType(XmlAccessType.FIELD)
public class Body {

    // add content dynamic

    @XmlElement(name = "EXPORTDATA")
    private ExportData exportData;

    public ExportData getExportData() {
        return exportData;
    }

    public void setExportData(ExportData exportData) {
        this.exportData = exportData;
    }
}
