/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.descriptiveprogramming;

/**
 * @author colin
 */
public class App {

    /**
     * Main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Descriptive descriptive = new Descriptive();
        descriptive.login("testUser", "secretPassword");
    }

}
