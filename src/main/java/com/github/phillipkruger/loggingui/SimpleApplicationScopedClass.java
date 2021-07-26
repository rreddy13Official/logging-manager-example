package com.github.phillipkruger.loggingui;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SimpleApplicationScopedClass {
    private static final Logger LOG = Logger.getLogger(SimpleApplicationScopedClass.class);

    void logMessage() {
        LOG.info("SimpleApplicationScopedClass has logged message.");
    }
}
