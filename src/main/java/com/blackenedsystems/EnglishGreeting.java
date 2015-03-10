package com.blackenedsystems;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Alan Tibbetts
 * @since 2015-03-10,  9:55 PM
 */
@Service
@Qualifier("english")
public class EnglishGreeting implements Greeting {

    @Override
    public String speak() {
        return "Good morning.";
    }
}
