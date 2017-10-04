package com.schmeckle;

import com.schmeckle.mediator.TestMediator;

public class Main {

    public static void main(String[] args) {

        new TestMediator();

        TavernTabFacade accessingTavern = new TavernTabFacade(12345678, 1234, 100);

        accessingTavern.withdrawCash(100.00);

        accessingTavern.withdrawCash(900.00);

        accessingTavern.depositCash(200.00);

        accessingTavern.withdrawCash(200.00);

        accessingTavern.withdrawCash(20.00);




    }
}
