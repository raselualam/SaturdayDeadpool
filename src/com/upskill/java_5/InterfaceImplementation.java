package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		System.out.println("My car has 2 door !");
		
	}

	@Override
	public int iBus() {
		return 10;
	}

	@Override
	public String iTruck() {
		return "Greenline";
	}

}
