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
		sm.ReadFile("src/source/streamingfile1.txt");
		sm.ReadFileWithWhile("src/source/streamingfile2.txt");
		sm.ReadFileWithFileReader("src/source/streamingfile2.txt");
		sm.CopyFile("src/source/streamingfileCopy1.txt", "src/source/streamingfileCopy2.txt");
		sm.ReadFileWithFileReader("src/source/streamingfileCopy2.txt");
	}

}
