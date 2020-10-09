package ca.gbc.comp3095.wk5lecturedi.controllers;

import ca.gbc.comp3095.wk5lecturedi.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    //uses service layer to get the greeting service
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
