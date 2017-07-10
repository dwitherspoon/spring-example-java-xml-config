package com.witherspoon.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * {@code AppProperties}
 *
 * @author david.witherspoon
 * @since Jul 10, 2017
 */
@Component
@ConfigurationProperties(prefix="app")
public class AppProperties {
    private String greeting;

    /**
     * @return the greeting
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * @param greeting the greeting to set
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}