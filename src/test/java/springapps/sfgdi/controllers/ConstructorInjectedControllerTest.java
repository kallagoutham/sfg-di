package springapps.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import springapps.sfgdi.Services.ConstructorGreetingService;
class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}