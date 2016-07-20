/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.descriptiveprogramming;

import java.util.Random;

/**
 * @author colin
 */
public class App {

    /**
     * An application method?
     *
     * @return a number 1 or -1 (failure)
     */
    public int appMethod() {
        if (new Random().nextInt(100) % 2 == 0) {
            return -1;
        }
        return 1;
    }

    /**
     * Main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Descriptive descriptive = new Descriptive();
        descriptive.login("testUser", "secretPassword");
    }

}
