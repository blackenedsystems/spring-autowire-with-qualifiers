package com.blackenedsystems;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alan Tibbetts
 * @since 2015-03-10,  10:02 PM
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Speaker speaker = (Speaker) applicationContext.getBean("speaker");
        speaker.saySomething();
    }
}
