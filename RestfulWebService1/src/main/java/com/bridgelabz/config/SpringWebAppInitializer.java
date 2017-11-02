package com.bridgelabz.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext appContext=new AnnotationConfigWebApplicationContext();
		appContext.register(AppContextConfiguration.class);
		
		ServletRegistration.Dynamic dispatcher=servletContext.addServlet("DispatcherServlet", new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
	}

}
