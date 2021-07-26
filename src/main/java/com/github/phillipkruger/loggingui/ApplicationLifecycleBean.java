package com.github.phillipkruger.loggingui;
import io.quarkus.runtime.StartupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class ApplicationLifecycleBean {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationLifecycleBean.class);
    SimpleClass sc = new SimpleClass();
    @Inject
    SimpleApplicationScopedClass sasc;

    void onStart(@Observes StartupEvent ev) {
        SimpleClass sc = new SimpleClass();
        sc.logMessage();
        LOG.info("SimpleClass has logged the message");
        sasc.logMessage();
        LOG.info("SimpleApplicationScopedClass has logged the message");
    }

}
