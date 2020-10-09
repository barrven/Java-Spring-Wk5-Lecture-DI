package ca.gbc.comp3095.wk5lecturedi.controllers;

import ca.gbc.comp3095.wk5lecturedi.services.GreetingService;

public class SetterInjectedController {

    public GreetingService greetingService;

    //at runtime this setter will be injected with the interface, which then  finds the concrete class that will implement it
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
