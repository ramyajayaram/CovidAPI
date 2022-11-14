package com.API.Automation.Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.stereotype.Component;

import com.jayway.jsonpath.JsonPath;

import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;



@Component
public class JsonpathReader {
	
	
	
		
		public static String readjsonPath(String ResponseFile, String path) throws FileNotFoundException, ParseException {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(ResponseFile));
			Object value = JsonPath.read(obj, path);
			
			
		
		
		
		
		return (String) value;
		
		}
		
		public static int readjsonPathInteger(String ResponseFile, String path) throws FileNotFoundException, ParseException {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(ResponseFile));
			Object value = JsonPath.read(obj, path);
			
			
		
		
		
		
		return (int) value;
		
		}
		
		
	}
	
	
	


