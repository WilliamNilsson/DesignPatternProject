package com.schmeckle;

/**
 * this class is meant to test the users current balance in the safe.
 * To see if the user will be allowed to make a purchase.
 */
public class CashCheck {

    private double cashInSafe = 1000.00;

    public double getCashInSafe() { return cashInSafe; }

    public void decreaseCashInAccount(double cashWithdrawn) { cashInSafe -= cashWithdrawn; }

    public void increaseCashInAccount(double cashDeposited) { cashInSafe += cashDeposited; }

    public boolean haveEnoughCash(double cashToWithdrawal) {

        if(cashToWithdrawal > getCashInSafe()) {

            System.out.println("Sorry buddy, no drinks for you.");
            System.out.println("Current Balance: " + getCashInSafe());

            return false;

        } else {

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("Drink bought, left in your safe is " + getCashInSafe());

            return true;

        }

    }

    /**
     * Method to simply add more cash to the safe.
     * @param cashToDeposit
     */
    public void addToSafe(double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit made: You have " + getCashInSafe() + " cash in your safe.");

    }

}
