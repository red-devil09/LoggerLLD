package org.example;

import org.example.impl1.DebugLogger;
import org.example.impl1.InfoLogger;
import org.example.impl1.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Logger infoLogger = new InfoLogger(null);
        Logger debugLogger = new DebugLogger(null);
        infoLogger.setNextLogger(debugLogger);

        infoLogger.log("debug","yayyyy");
    }
}