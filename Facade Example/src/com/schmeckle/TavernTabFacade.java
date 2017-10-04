package com.schmeckle;

/**
 * Created by DevWN on 2017-09-05.
 */
public class TavernTabFacade {

    private int VIPNumber;
    private int securityCode;
    public int schmeckles;

    VIPNumberCheck acctChecker;
    SuperSecretPasswordCheck codeChecker;
    CashCheck fundChecker;


    WelcomeToTheTavern tavernWelcome;

    public TavernTabFacade(int newAcctNum, int newSecCode, int money){

        VIPNumber = newAcctNum;
        securityCode = newSecCode;
        schmeckles = money;

        tavernWelcome = new WelcomeToTheTavern();
        acctChecker = new VIPNumberCheck();
        codeChecker = new SuperSecretPasswordCheck();
        fundChecker = new CashCheck();

    }

    public int getVIPNumber() { return VIPNumber; }

    public int getSecurityCode() { return securityCode; }


    public void withdrawCash(double cashToGet){

        if(acctChecker.VIPActive(getVIPNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughCash(cashToGet))
        {

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }


    public void depositCash(double cashToDeposit){

        if(acctChecker.VIPActive(getVIPNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())) {

            fundChecker.addToSafe(cashToDeposit);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }

}
