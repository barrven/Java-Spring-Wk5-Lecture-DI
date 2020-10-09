package ca.gbc.comp3095.wk5lecturedi.controllers;

import ca.gbc.comp3095.wk5lecturedi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    //Import the class to test
    PropertyInjectedController controller;

    @BeforeEach //Says that before you run each of these unit tests, invoke this method first
    void setup(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl(); //instantiate the implementation class
    }

    @Test //annotation is part of the Maven lifecycle. before building these tests will be run by Maven
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}