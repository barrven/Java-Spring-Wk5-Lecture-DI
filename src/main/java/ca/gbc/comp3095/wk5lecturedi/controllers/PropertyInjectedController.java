package ca.gbc.comp3095.wk5lecturedi.controllers;

import ca.gbc.comp3095.wk5lecturedi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService; //property is an interface

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
