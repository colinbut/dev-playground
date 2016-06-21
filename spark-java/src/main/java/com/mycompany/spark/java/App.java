package com.mycompany.spark.java;

import static spark.Spark.get;

/**
 * Hello world Spark Java
 *
 * @author colin
 */
public class App {

    public static void main( String[] args ) {
        get("/hello", (req, res) -> "Hello World");
    }
}
