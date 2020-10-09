package ca.gbc.comp3095.wk5lecturedi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello");
        return "Hi folks";
    }

}
