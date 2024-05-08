package org.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJson {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
	File f= new File("C:\\Users\\Jeevitha B\\eclipse-workspace\\DeSerialization\\src\\test\\resources\\Samp.json");	
    ObjectMapper objectmapper=new ObjectMapper();
    ArrayList<Topping> al1= new ArrayList<Topping>();
    Topping topping = new Topping("5001", "Java");
    Topping topping1 = new Topping("5002", "Selenium");
    Topping topping2 = new Topping("5003", "Python");
    Topping topping3 = new Topping("5004", "SQL");
    Topping topping4 = new Topping("5005", "Ruby");
    al1.add(topping);
    al1.add(topping1);
    al1.add(topping2);
    al1.add(topping3);
    al1.add(topping4);
    Batter batter= new Batter("1001", "Regular");
    Batter batter2= new Batter("1002","Chocolate");
    Batter batter3= new Batter("1003","Blueberry");
    Batter batter4= new Batter("1004", "Devil Food");
    ArrayList<Batter> al= new ArrayList<Batter>();
    al.add(batter);
    al.add(batter2);
    al.add(batter3);
    al.add(batter4); 
    Batters batters=new Batters(al);
    Root root=new Root("0001", "donut","Cake", 0.55, batters, al1 );
    objectmapper.writeValue(f, root);
	}

}
