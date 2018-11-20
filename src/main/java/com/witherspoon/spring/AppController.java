package com.witherspoon.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code AppController}
 *
 * @author david.witherspoon
 * @since Jul 10, 2017
 */
@RestController
public class AppController {

    private AppProperties properties;
    
    @Value("${greeting}")
    private String xmlGreeting;
    
    public AppController(AppProperties properties) {
        this.properties = properties;
    }
    
    @GetMapping("/")
    public String hello() {
        return properties.getGreeting();
    }
    
    @GetMapping("/HellofromXml") 
    public String helloXml() {
        return xmlGreeting;
    }
}