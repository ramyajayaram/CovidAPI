package com.API.Automation.Utility;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@Component
public class RequestClient

{
	@Autowired
	static

	Hooks hooks;
	@Autowired
	static
 	AppConfig appconfig;

	public static String Webservicecall(String URL, String filetype) throws IOException {

		hooks.write(" The  Request URL is " + appconfig.properties().getProperty("URL"));
		Response response = RestAssured.given().contentType(filetype).log().all().when().get(URL).andReturn();
		hooks.write("The response:" + "\n" + response.prettyPrint());
		hooks.responseFileCreate(response.asString());
		return response.asString();

	}

}