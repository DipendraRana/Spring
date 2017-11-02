package org.o7planning.spring;

import org.o7planning.spring.bean.GreetingService;
import org.o7planning.spring.bean.MyComponent;
import org.o7planning.spring.config.AppConfiguration;
import org.o7planning.spring.language.Language;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		System.out.println("-----------");
		Language language=(Language) context.getBean("language1");
		
		System.out.println("Bean Language: "+language);
		System.out.println("Get language.sayBye(): "+language.getBye());
		
		System.out.println("------------");
		
		GreetingService service=(GreetingService) context.getBean("greetingService");
		
		service.sayGreeting();
		
		System.out.println("------------");
		
		MyComponent myComponent=(MyComponent) context.getBean("myComponent");
		
		myComponent.showAppInfo();
		
		((AnnotationConfigApplicationContext) context).close();
		
	}

}
