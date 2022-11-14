package com.API.Automation.Utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.API.Automation.Report.Report;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


@Component
public class Hooks  extends Baseclass{
	
	
	
	@Autowired
	Report report;
	
	public static Scenario scenario;

	@Before()
	public void setup(Scenario scenario) {

		System.out.println("---create  a folder  for Request and Response");

		this.scenario = scenario;
		report.directorycreate();
		System.out.println(scenario.getSourceTagNames());

	}

	public static String write(String Value) {

		scenario.log(Value);

		return Value;

	}

		
	
	
	public static void responseFileCreate(String response) throws IOException {

		
		ResponseFilePath = directorypath + "/" + dir + "/" + scenario.getSourceTagNames() + "Response.json";	
		@SuppressWarnings("resource")
		File f = new File(ResponseFilePath);
		f.getParentFile().mkdirs();
		f.createNewFile();
		FileWriter file = new FileWriter(ResponseFilePath);
		file.write(response);
		file.flush();

	}
	
	
	
	
	
	
	

}
