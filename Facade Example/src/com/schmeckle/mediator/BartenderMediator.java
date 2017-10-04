package com.schmeckle.mediator;

import java.util.ArrayList;

/**
 * Mediator for the bartender, connects the same methods from the Mediator for later implementation
 */
public class BartenderMediator implements Mediator{

    private ArrayList<Patron> patrons;

    private int numberOfPatrons = 0;


    public BartenderMediator(){

        patrons = new ArrayList<>();
    }


    /**
     * mehtod for taking the the patron parameters and returning them for the bartender for handling
     * @param patronName
     * @param patronNumber
     */

    public void wantsToDrink(String patronName, int patronNumber) {
        System.out.println(patronName + " wants to Drink\n");


    }


    /**
     * this method allows the bartender to create new patrons.
     * @param newPatron
     */
    public void addPatron(Patron newPatron){

        patrons.add(newPatron);

        numberOfPatrons++;

        newPatron.setPatronNumber(numberOfPatrons);
    }


}
