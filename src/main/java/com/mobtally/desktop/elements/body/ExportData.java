package com.mobtally.desktop.elements.body;

import javax.xml.bind.annotation.XmlElement;

public class ExportData {

    @XmlElement(name = "REQUESTDESC")
    private RequestDesc requestDesc;

    public RequestDesc getRequestDesc() {
        return requestDesc;
    }

    public void setRequestDesc(RequestDesc requestDesc) {
        this.requestDesc = requestDesc;
    }
}
