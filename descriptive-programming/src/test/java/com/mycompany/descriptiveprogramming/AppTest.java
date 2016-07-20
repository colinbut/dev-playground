/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.descriptiveprogramming;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author colin
 */
public class AppTest {

    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void thisMethodTestOnePlusOneEqualsTwo() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testAppMethodSuccess() {
        assertEquals(1, app.appMethod());
    }

    @Test
    public void testAppMethodReturnsOne() {

    }

    @Test
    public void appMethodShouldReturnOneWhenSuccess() {

    }

    @Test
    public void appMethodShouldReturnMinusOneWhenFailure() {

    }

}
