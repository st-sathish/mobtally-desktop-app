package com.mobtally.desktop.elements;

public interface EnvelopBuilder {

    /**
     * Creates a new media package in the temporary directory defined by the java runtime property
     * <code>java.io.tmpdir</code>.
     *
     * @return the new media package
     * @throws TallyException
     *           if creation of the new media package fails
     */
    Envelop createNewEmpty() throws TallyException;
}
