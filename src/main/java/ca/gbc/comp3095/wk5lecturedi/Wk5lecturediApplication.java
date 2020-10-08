package ca.gbc.comp3095.wk5lecturedi;

import ca.gbc.comp3095.wk5lecturedi.controllers.MyController;
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
    }

}
