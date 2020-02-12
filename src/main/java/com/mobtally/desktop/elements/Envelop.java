package com.mobtally.desktop.elements;

import com.mobtally.desktop.elements.header.Header;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ENVELOP")
@XmlAccessorType(XmlAccessType.NONE)
public class Envelop {

    @XmlElement(name = "HEADER")
    private Header header;

    @XmlElement(name = "BODY")
    private Object body;

    /** Context for serializing and deserializing */
    static final JAXBContext context;

    public Envelop() {
        // required JAXB
    }

    static {
        try {
            context = JAXBContext.newInstance("com.mobtally.desktop.elements", Envelop.class.getClassLoader());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public static JAXBContext getContext() {
        return context;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
