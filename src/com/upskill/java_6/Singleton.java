package com.upskill.java_6;

public class Singleton {
	
	// Singleton is class that can have only one object
	
	// Private constructor, it prevents any other class from instantiating
	private Singleton(){
		
	}
	
	//Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	public static Singleton getInstance(){
		return SingletonObj;
	}
	
	protected static void demo(){
		System.out.println("Singleton Demo Method");
	}
	
	protected static void shamme(){
		System.out.println("Singleton Shamme Method");
	}
	
	protected static void khaled(){
		System.out.println("Singleton khaled Method");
	}
	
	protected static void masud(){
		System.out.println("Singleton masud Method");
	}
}