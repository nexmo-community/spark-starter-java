package com.nexmo.starter;

import spark.Route;

import static spark.Spark.*;

public class App {
    private static final int PORT = 3000;

    public static void main(String[] args) {
        // Sample GET Request Route
        Route getExampleRoute = (req, res) -> "Hello world!";

        // Sample POST Request Route
        Route postExampleRoute = (req, res) -> "Hello world!";

        // Set the listening port
        port(getPort());

        // Register the routes
        get("/example", getExampleRoute);
        post("/example", postExampleRoute);
    }

    private static int getPort() {
        String environmentPort = System.getenv("PORT");
        return environmentPort != null ? Integer.parseInt(environmentPort) : PORT;
    }
}
