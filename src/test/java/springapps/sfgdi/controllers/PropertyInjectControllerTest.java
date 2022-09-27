package springapps.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springapps.sfgdi.Services.ConstructorGreetingService;
class PropertyInjectControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}