package org.example.impl1;

public class DebugLogger extends Logger{

    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equalsIgnoreCase("debug"))
            System.out.println("debug log in progress");
        else
            super.log(logLevel,message);
    }
}
