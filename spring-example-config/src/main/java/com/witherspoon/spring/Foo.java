package com.witherspoon.spring;

import org.springframework.stereotype.Component;

/**
 * {@code Foo}
 *
 * @author david.witherspoon
 * @since Jul 10, 2017
 */
@Component
public class Foo {
    private String a;
    private String b;
    
    public Foo() {
        super();
    }

    public Foo(String a, String b) {
        super();
        this.a = a;
        this.b = b;
    }

    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public String getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(String b) {
        this.b = b;
    }
}