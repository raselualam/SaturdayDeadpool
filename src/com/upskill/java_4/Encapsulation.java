package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	private String name;				//write & read
	private int ssn;					//write only
	private String username;			//read only
	private int age;
	private String city;
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		obj.setSSN(56845214);
		System.out.println(obj.getUsername());
		obj.setAge(30);
		System.out.println(obj.getAge());
		obj.setCity("NYC");
		System.out.println(obj.getCity());
	}
	
	//Setter Method - age						//set the data, Write
	public void setCity(String value){
		city = value;
	}
	
	//Getter Method - age						//get the data, Read
	public String getCity(){
		return city;
	}	
	//Setter Method - age						//set the data, Write
	public void setAge(int value){
		age = value;
	}
	
	//Getter Method - age						//get the data, Read
	public int getAge(){
		return age;
	}
	
	//Setter Method - name						//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name						//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						//set the data, Write only
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - username		 			//get the data, Read only
	public String getUsername(){
		return username;
	}
}
