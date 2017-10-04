package com.schmeckle;

/**
 * Created by DevWN on 2017-09-05.
 */
public class SuperSecretPasswordCheck {

    public int getSecurityCode() {
        int securityCode = 1234;
        return securityCode; }

    public boolean isCodeCorrect(int secCodeToCheck){

        if(secCodeToCheck == getSecurityCode()) {

            return true;

        } else {

            return false;

        }

    }

}
