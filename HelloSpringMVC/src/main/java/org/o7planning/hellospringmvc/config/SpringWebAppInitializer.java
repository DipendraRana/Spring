package org.o7planning.hellospringmvc.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//Create the dispatcher servlet's Spring application context
		AnnotationConfigWebApplicationContext appContext=new AnnotationConfigWebApplicationContext();
		appContext.register(ApplicationContextConfig.class);
		
		// Register and map the dispatcher servlet
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher",
                new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		dispatcher.setInitParameter("contextClass", appContext.getClass().getName());
		
		// Manage the lifecycle of the application context
		servletContext.addListener(new ContextLoaderListener(appContext));
		
		FilterRegistration.Dynamic fileRegistration=servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
		
		fileRegistration.setInitParameter("encoding", "UTF-8");
		fileRegistration.setInitParameter("forceEncoding", "true");
		fileRegistration.addMappingForUrlPatterns(null, true, "/*");
	}
	
}
