package com.github.phillipkruger.loggingui;

import org.jboss.logging.Logger;

public class SimpleClass {

    private static final Logger LOG = Logger.getLogger(SimpleClass.class);

    void logMessage() {
        LOG.info("info from SimpleClass");
    }
}

