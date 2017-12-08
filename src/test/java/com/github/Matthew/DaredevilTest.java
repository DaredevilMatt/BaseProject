package com.github.Matthew;

import org.junit.Assert;
import org.junit.Test;

public class DaredevilTest {
    @Test
    public void main() throws Exception {
        String h = hello();
        Assert.assertEquals(new String("I am Matthew Murdock.").compareTo(hello()),0);
    }

    @Test
    public String hello() throws Exception {
        if(true)
            return "I am Matthew Murdock.";
        return null;
    }

}
