package ca.gbc.comp3095.wk5lecturedi.controllers;

import ca.gbc.comp3095.wk5lecturedi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach //Says that before you run each of these unit tests, invoke this method first
    void setup(){
        //initialize controller instance
        controller = new SetterInjectedController();
        //inject an instance of the implementation of the GreetingService interface for test purposes
        //simulates runtime injection of the concrete class injection
        //this is hardcoded and not using spring injection
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}