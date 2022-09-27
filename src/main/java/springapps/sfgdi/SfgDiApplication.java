package springapps.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springapps.sfgdi.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(SfgDiApplication.class, args);
		PetController petController =(PetController) ctx.getBean("petController",PetController.class);
		System.out.println("The Best Pet is------");
		System.out.println(petController.whichPetIsTheBest());
		MyController myController=(MyController) ctx.getBean("myController");
		I18nController i18nController=(I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		System.out.println("-------------In Primary Bean");
		System.out.println(myController.SayHello());
		System.out.println("--------Property");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("---------Setter");
		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("------------Constructor");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
