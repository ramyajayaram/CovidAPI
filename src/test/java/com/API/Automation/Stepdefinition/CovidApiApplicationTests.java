package com.API.Automation.Stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.API.Automation.Utility.Baseclass;
import com.API.Automation.Utility.AppConfig;
import com.API.Automation.Utility.Hooks;
import com.API.Automation.Utility.JsonpathReader;
import com.API.Automation.Utility.RequestClient;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.minidev.json.parser.ParseException;


 public class CovidApiApplicationTests extends Baseclass {
	
	@Autowired
 	RequestClient requestClient;
	
	@Autowired
 	AppConfig appconfig;	
	
	@Autowired
 	Hooks hooks;
	
	
	@Autowired
	JsonpathReader jsonpathReader;
	
	

	@SuppressWarnings("static-access")
	@Given("^Initiate a Request call to API$")
	public void getCovidAPI() throws IOException, ParseException {
		
		
	
		requestClient.Webservicecall(appconfig.properties().getProperty("URL"), appconfig.properties().getProperty("contenttype"));
		




	}
	
	@When("^validate the Country australia for the cases Confirmed$")
	
	public void validateaustaralia() throws FileNotFoundException, ParseException
	
	{
		
		int Australia = jsonpathReader.readjsonPathInteger(ResponseFilePath, appconfig.properties().getProperty("Australia"));
		
		int val = Integer.parseInt(appconfig.properties().getProperty("confirmed"));
		
		Assert.assertEquals(Australia, val);
		Hooks.write(" The  value validation: Actual:" + Australia + " "+"Expected Value : :"
				+ appconfig.properties().getProperty("confirmed"));
		
		
		
	}
			
			
			
	
	
	
	
	
	
	
	
	
	

}
