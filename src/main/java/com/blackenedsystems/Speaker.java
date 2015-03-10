package com.blackenedsystems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @author Alan Tibbetts
 * @since 2015-03-10,  9:59 PM
 */
@Component
public class Speaker {

    private static final Logger LOGGER = Logger.getLogger("Speaker");

    private String name;

    @Autowired
    @Qualifier("language")
    private Greeting greeting;

    public void saySomething() {
        LOGGER.info(greeting.speak());
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
