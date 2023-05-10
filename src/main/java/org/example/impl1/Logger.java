package org.example.impl1;

public abstract class Logger {

    private Logger nextLogger;

    public Logger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void log(String logLevel,String message){
        if(nextLogger!=null)
            nextLogger.log(logLevel,message);
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
