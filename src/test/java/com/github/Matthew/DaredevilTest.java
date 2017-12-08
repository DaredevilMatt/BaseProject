package com.github.Matthew;

import org.junit.Assert;
import org.junit.Test;

public class DaredevilTest {
    @Test
    public void main() throws Exception {

        Assert.assertEquals(new String("I am Matthew Murdock.").compareTo(Daredevil.hello()),0);
    }    @Test
    public void hello() throws Exception {
        Daredevil.hello();
    }

}
