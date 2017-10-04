package com.schmeckle;

/**
 * Created by DevWN on 2017-09-05.
 */
public class TestTavernSafe {

    public static void main(String[] args){

        TavernTabFacade accessingBank = new TavernTabFacade(12345678, 1234, 100);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(990.00);

    }

}
