package org.serialization;

import java.util.ArrayList;

public class Root {
	private String id;
	
	private String type;
	

	public Root(String string, String string2, String string3, double d, Batters batters2, ArrayList<Topping> al1) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.ppu = ppu;
		this.batters = batters;
		this.topping = topping;	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPpu() {
		return ppu;
	}

	public void setPpu(double ppu) {
		this.ppu = ppu;
	}

	public Batters getBatters() {
		return batters;
	}

	public void setBatters(Batters batters) {
		this.batters = batters;
	}

	public ArrayList<String> getTopping() {
		return topping;
	}

	public void setTopping(ArrayList<String> topping) {
		this.topping = topping;
	}

	private String name;
	
	private double ppu;
	
	private Batters batters;
	
	private ArrayList<String> topping;

}
