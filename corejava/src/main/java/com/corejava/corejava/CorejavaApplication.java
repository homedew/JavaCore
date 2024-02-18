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

		System.out.println();
		System.out.println("Streaming data for byte");
		byte[] data = {'H','e', 'l','l','o'};
		sm.ReadByteArray(data);
		byte[] data2 = {'w','o','r','l','d'};
		sm.ReadByteArray2(data2);

		sm.WriteByteArray();

		System.out.println();
		System.out.println("Streaming data for bytes");
		char[] data3 = {'C','H'};
		sm.ReadCharArray(data3);

		System.out.println();
		System.out.println("Buffer InputStream");
		sm.BufferInputStream();
		sm.BufferWithMark();
	}

}
