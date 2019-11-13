package houseAutomation.classes;


import houseAutomation.Interface.ElectronicDevices;
import houseAutomation.Interface.Operable;

public class Stereo implements Operable, ElectronicDevices {

	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void volumeControl(int value) {
		// TODO Auto-generated method stub
		System.out.println("setting the volume to "+value +" for Stereo");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
	System.out.println("Turing on the stereo");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning off the stereo");
	}

}
