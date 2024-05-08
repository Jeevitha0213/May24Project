package org.des;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadDeserialization {

	public static void main(String[] args) throws IOException {
		FileReader filereader= new FileReader(new File("C:\\Users\\Jeevitha B\\eclipse-workspace\\DeSerialization\\src\\test\\resources\\Sample.json"));
		ObjectMapper objectmapper=new ObjectMapper();
		Root readValue = objectmapper.readValue(filereader, Root.class);
		System.out.println(readValue.getName());
		System.out.println(readValue.getAge());
		System.out.println(readValue.isStatus());
		
		Address address = readValue.getAddress();
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getCountry());
		 
		ArrayList<String> courses = readValue.getCourses();
		for(int i=0;i<courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		}
	}
