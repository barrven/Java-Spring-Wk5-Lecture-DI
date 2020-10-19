package ca.gbc.comp3095.wk5lecturedi;

import ca.gbc.comp3095.wk5lecturedi.controllers.ConstructorInjectedController;
import ca.gbc.comp3095.wk5lecturedi.controllers.MyController;
import ca.gbc.comp3095.wk5lecturedi.controllers.PropertyInjectedController;
import ca.gbc.comp3095.wk5lecturedi.controllers.SetterInjectedController;
import ca.gbc.comp3095.wk5lecturedi.services.GreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Wk5lecturediApplication {

    public static void main(String[] args) {
        //configure the context so we can access beans
        ConfigurableApplicationContext ctx = SpringApplication.run(Wk5lecturediApplication.class, args);
        //get your controller from the context
        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();
        System.out.println(greeting);


        System.out.println("-----------Constructor");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


        //Requires annotation in the controller (on the setter method so spring can know what to inject
        System.out.println("-----------Setter");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        //also needs autowired on the property so Spring knows what property to inject
        System.out.println("-----------Property");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

    }

}
