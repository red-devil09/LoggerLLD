package org.example.impl1;

public class InfoLogger extends Logger{

    //yaani jb hum infoLogger ka object bna rhe hai, to tbhi pass kr rhe hai ki iske next kon hoga chain mei
    // if want to end the chain so "null" bhej do
    public InfoLogger(Logger nextLogger){
        super(nextLogger);
    }

    //sbse bdia chiz ayegi ab
    //ab hum vo method ko krenge overide, and if-else se choose krenge ki ye wala method run krana
    //hai ya fir iski parent class wala

    @Override
    public void log(String logLevel, String message) {
        //if true to current wala
        if(logLevel.equalsIgnoreCase("info")){
            System.out.println("info log done right");
        }
        else
            //if false to parent wala method call kr denge, and parent ke method mei likha hai
        //ki jo chain mei next hai, uss object ko bhejo ye method
          super.log(logLevel, message);
    }
}
