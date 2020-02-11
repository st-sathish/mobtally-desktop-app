package com.mobtally.desktop.elements;

public final class EnvelopBuilderFactory {

    /** Class name for the default media package builder */
    private static final String BUILDER_CLASS = "com.mobtally.tallypackage.TallyPackageBuilderImpl";

    /** Name of the system property */
    public static final String PROPERTY_NAME = "com.mobtally.tallypackage.builder";

    /** The implementation class name */
    private static String builderClassName = BUILDER_CLASS;

    /** The singleton instance of this factory */
    private static final EnvelopBuilderFactory factory = new EnvelopBuilderFactory();

    private EnvelopBuilderFactory() {
        String className = System.getProperty(PROPERTY_NAME);
        if (className != null) {
            builderClassName = className;
        }
    }

    public static EnvelopBuilderFactory newInstance() {
        return factory;
    }
}
