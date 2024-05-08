package org.serialization;

import java.util.ArrayList;

public class Batters {
	
	public Batters(ArrayList<Batter> batter) {
		super();
		this.batter = batter;
	}

	public ArrayList<Batter> getBatter() {
		return batter;
	}

	public void setBatter(ArrayList<Batter> batter) {
		this.batter = batter;
	}

	private ArrayList<Batter> batter;

}
