package com.mobtally.desktop.elements.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HEADER")
@XmlAccessorType(XmlAccessType.FIELD)
public class Header {

    @XmlElement(name = "VERSION")
    private String version;

    @XmlElement(name = "TALLYREQUEST")
    private String tallyRequest;

    @XmlElement(name = "TYPE")
    private String type;

    @XmlElement(name = "ID")
    private String id;

    @XmlElement(name = "STATUS")
    private String status;


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTallyRequest() {
        return tallyRequest;
    }

    public void setTallyRequest(String tallyRequest) {
        this.tallyRequest = tallyRequest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
