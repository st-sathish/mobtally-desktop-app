package com.mobtally.desktop.elements;

import com.mobtally.desktop.elements.body.Body;
import com.mobtally.desktop.elements.header.Header;
import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.eclipse.persistence.jaxb.dynamic.DynamicJAXBContext;
import org.eclipse.persistence.jaxb.dynamic.DynamicJAXBContextFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement(name = "ENVELOP")
@XmlAccessorType(XmlAccessType.FIELD)
public class Envelop {

    @XmlElement(name = "HEADER")
    private Header header;

    @XmlElement(name = "BODY")
    private Body body;

    /** Context for serializing and deserializing */
    static final JAXBContext context;
    //static final DynamicJAXBContext context;

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

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
