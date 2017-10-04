package com.schmeckle.mediator;

/**
 * A class for testing all inside the mediator folder, and providing it to the main.
 */
public class TestMediator {

    BartenderMediator test = new BartenderMediator();

    private Patron customer = new Michael(test);

    private Dennis customer2 = new Dennis(test);




}
