package com.mobtally.desktop.elements;

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
            StringWriter writer = new StringWriter();
            marshaller.marshal(envelop, writer);
            return writer.toString();
        } catch (JAXBException e) {
            throw new IllegalStateException(e.getLinkedException() != null ? e.getLinkedException() : e);
        }
    }
}
