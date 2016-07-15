/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.junit5;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author colin
 */
@RunWith(JUnitPlatform.class)
public class FirstJUnit5Test {

    @Test
    public void firstTest() {
        assertEquals(2, 1 + 1);
    }

}
