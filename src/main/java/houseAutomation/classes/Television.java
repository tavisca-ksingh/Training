package houseAutomation.classes;

import houseAutomation.Interface.ElectronicDevices;
import houseAutomation.Interface.Operable;
import houseAutomation.Interface.PlumbingDevices;

public class Television implements Operable, PlumbingDevices {

	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void turnOn() {
		
		System.out.println("Turn the Television on");
	}

	@Override
	public void turnOff() {
		
		System.out.println("Turn the Television off");
	}

	@Override
	public void higher() {

	}

	@Override
	public void lower() {

	}
}
