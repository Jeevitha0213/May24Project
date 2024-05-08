package org.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteData {
 public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
	
	 File f= new File("C:\\Users\\Jeevitha B\\eclipse-workspace\\DeSerialization\\src\\test\\resources\\Data.json");
	 ObjectMapper objectmapper=new ObjectMapper();
	 ArrayList<String> al = new ArrayList();
	 al.add("Java");
	 al.add("Selenium");
	 al.add("Python");
	 Address address = new Address("Chennai", "TN, ", "India");
	 Root1 root1 = new Root1("Jeevitha", 30, true, address, al); 
	 objectmapper.writeValue(f, root1);
	 
}
}
