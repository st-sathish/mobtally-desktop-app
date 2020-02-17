package com.mobtally.desktop.elements.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EXPORTDATA")
@XmlAccessorType(XmlAccessType.FIELD)
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
