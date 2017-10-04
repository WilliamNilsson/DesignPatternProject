package com.schmeckle.mediator;

/**
 * This mediator function is to provide methods and a connection/mediator for the patrons.
 */
public interface Mediator {

    void addPatron(Patron patron);

    void wantsToDrink(String patronName, int patronNumber);
}
