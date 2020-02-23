package com.mobtally.desktop.elements;

import com.mobtally.desktop.elements.body.Body;
import org.eclipse.persistence.dynamic.DynamicEntity;
import org.eclipse.persistence.jaxb.JAXBHelper;
import org.eclipse.persistence.jaxb.ObjectGraph;
import org.eclipse.persistence.jaxb.Subgraph;
import org.eclipse.persistence.jaxb.dynamic.DynamicJAXBContext;
import org.eclipse.persistence.jaxb.dynamic.DynamicJAXBContextFactory;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public final class TallyParser {

    /**
     * Private constructor to prohibit instances of this static utility class.
     */
    private TallyParser() {
        // Nothing to do
    }

    public static String getAsXml(Envelop envelop) {
        if (envelop == null)
            throw new IllegalArgumentException("Tallypackage must not be null");
        try {
            Marshaller marshaller = Envelop.context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
            marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);
            StringWriter writer = new StringWriter();
            marshaller.marshal(envelop, writer);
            return writer.toString();
        } catch (JAXBException e) {
            throw new IllegalStateException(e.getLinkedException() != null ? e.getLinkedException() : e);
        }
    }

    public static String getAsXml(String key, Object object) {
        try {
            Envelop envelop = new Envelop();
            Marshaller marshaller = Envelop.context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
            marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);
            StringWriter writer = new StringWriter();
            marshaller.marshal(envelop, writer);
            return writer.toString();
        } catch (JAXBException e) {
            throw new IllegalStateException(e.getLinkedException() != null ? e.getLinkedException() : e);
        }
    }
}
