package houseAutomation.classes;

import houseAutomation.Interface.Operable;

public class Fan implements Operable {

	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Fan started");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Fan shutdown");

	}

}
