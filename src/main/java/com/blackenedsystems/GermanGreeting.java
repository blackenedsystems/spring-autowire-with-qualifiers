package com.blackenedsystems;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Alan Tibbetts
 * @since 2015-03-10,  10:07 PM
 */
@Service
@Qualifier("german")
public class GermanGreeting implements Greeting {
    @Override
    public String speak() {
        return "Guten morgen";
    }
}
