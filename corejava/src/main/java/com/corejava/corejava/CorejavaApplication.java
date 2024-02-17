package com.corejava.corejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Inteface.IStreamingManager;
import Implement.*;


@SpringBootApplication
public class CorejavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorejavaApplication.class, args);
		IStreamingManager sm = new StreamingManager();
		sm.WriteIntoFile("Now The world is gonna to my name");
		sm.WriteIntoFile("You dont know who I am?", 13, 10);
	}

}
