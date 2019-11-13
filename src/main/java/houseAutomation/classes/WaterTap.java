package houseAutomation.classes;

import houseAutomation.Interface.Operable;
import houseAutomation.Interface.PlumbingDevices;

public class WaterTap implements PlumbingDevices, Operable {

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
		
		System.out.println("Turning on the water tap");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning off the water tap");

	}

	@Override
	public void higher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lower() {
		// TODO Auto-generated method stub

	}

}
