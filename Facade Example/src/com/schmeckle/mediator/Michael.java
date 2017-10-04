package com.schmeckle.mediator;

/**
 * this is a patron constructed in the image/interface of the mediator
 */
public class Michael extends Patron{

    public Michael(Mediator newMediator){
        super(newMediator);

        System.out.println("michael has entered the tavern\n");
    }




}
