package com.schmeckle.mediator;

/**
 * Unfinished mediator instance.
 * Meant for taking in the parameters of Dennis and Michel for dabbling between future methods.
 */
public class Bartender {

    private int patronNum = 0;
    private String patronName = "";

    public Bartender(String Name, int patronNumber){

        patronNum = patronNumber;
        patronName = Name;
    }

    public int getpatronNum(){ return patronNum; }
    public String getPatronName(){ return patronName; }

}
