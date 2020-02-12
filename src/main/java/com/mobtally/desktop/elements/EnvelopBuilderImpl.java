package com.mobtally.desktop.elements;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EnvelopBuilderImpl implements EnvelopBuilder {

    private static final Logger logger = LoggerFactory.getLogger(EnvelopBuilderImpl.class);

    /**
     * Creates a new media package builder.
     *
     * @throws IllegalStateException
     *           if the temporary directory cannot be created or is not accessible
     */
    public EnvelopBuilderImpl() {
    }


    @Override
    public Envelop createNewEmpty() throws TallyException {
        return new Envelop();
    }
}
