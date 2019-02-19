package com.nexmo.starter;

import spark.Route;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // Sample GET Request Route
        Route getExampleRoute = (req, res) -> "Hello world!";

        // Sample POST Request Route
        Route postExampleRoute = (req, res) -> "Hello world!";

        // Set the listening port to 3000
        port(3000);

        // Register the routes
        get("/example", getExampleRoute);
        post("/example", postExampleRoute);
    }
}
