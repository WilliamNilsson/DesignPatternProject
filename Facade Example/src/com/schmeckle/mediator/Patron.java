package com.schmeckle.mediator;

/**
 * The superClass for the patron instances, Michael and Dennis.
 * Provides them with methods and parameters to be defined after.
 */
public abstract class Patron {

    private Mediator mediator;

    private int patronNumber;

    public Patron(Mediator newMediator){
        mediator = newMediator;

        mediator.addPatron(this);
    }

    public void wantsToDrink(String patronName){

        mediator.wantsToDrink(patronName, this.patronNumber);
    }

    public void setPatronNumber(int VIPNumber){ patronNumber = VIPNumber; }
}
