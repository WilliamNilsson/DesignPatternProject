package com.schmeckle;

/**
 * Created by DevWN on 2017-09-05.
 */
public class VIPNumberCheck {

    private int VIPNumber = 12345678;

    public int getVIPNumber() { return VIPNumber; }

    public boolean VIPActive(int VIPNumToCheck){

        if(VIPNumToCheck == getVIPNumber()) {

            return true;

        } else {

            return false;

        }

    }

}