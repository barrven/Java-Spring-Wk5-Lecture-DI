package ca.gbc.comp3095.wk5lecturedi.services;

import org.springframework.stereotype.Service;

@Service // Spring will manage this at the service layer
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello";
    }
}
