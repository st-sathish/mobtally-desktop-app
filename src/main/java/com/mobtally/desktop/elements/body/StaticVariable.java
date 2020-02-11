package com.mobtally.desktop.elements.body;

import javax.xml.bind.annotation.XmlElement;

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
