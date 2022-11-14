package com.API.Automation.Report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.API.Automation.Utility.Baseclass;

import io.cucumber.java.Scenario;
import net.bytebuddy.asm.Advice.This;

@Component
public class Report extends Baseclass {

	public static	Scenario scenario;
	public  static String directorycreate() {

		

		try {

			Path path = Paths.get(dir);
			Files.createDirectories(path);
		Path folderPath=	FileSystems.getDefault().getPath(new String()).toAbsolutePath();
		directorypath=folderPath.toString();
			System.out.println("Directory is created!");

		} catch (IOException e) {
			System.err.println("Failed to create directory!" + e.getMessage());
		}
		System.out.println(directorypath);
		return directorypath;	
		
	

	}
	

}
