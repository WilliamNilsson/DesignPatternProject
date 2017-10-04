package com.schmeckle.mediator;

/**
 * this is a patron constructed in the image/interface of the mediator
 */
public class Dennis extends Patron{

    public Dennis(Mediator newMediator){
        super(newMediator);

        System.out.println("Dennis has entered the tavern\n");
    }


}
