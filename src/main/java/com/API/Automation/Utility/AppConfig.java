package com.API.Automation.Utility;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Service;

@Service
public class AppConfig {
	

	public static  ConfigurableEnvironment properties()
	{
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.register(PropertySourcesapp.class);
		context.refresh();
		
		return context.getEnvironment();
		
		
		
		
		
	}
	
	

}
