package com.spring;

public class Servics {
	Bulb bulb;
	
	public Bulb getBulb() {
		return bulb;
	}
	
	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}
	
	public String ask(String name) {
		if(name.equals("Havils"))
			bulb = new Havils();
		else if(name.equals("Nippo"))
			bulb = new Nippo();
		else {
			System.out.println("Wrong bulb");
		    return null;
		}
		return bulb.getBulb();
	}

}
