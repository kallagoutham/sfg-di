package springapps.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import springapps.sfgdi.Services.GreetingService;

@Controller
public class MyController {
    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String SayHello(){
        return greetingService.sayGreeting();
    }
}
