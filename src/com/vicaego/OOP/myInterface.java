package com.vicaego.OOP;

public interface myInterface {

	//interface use to achieve multiple inheritance in java
	//interface methods cannot be private
	//interface just define method definition
	//class which implement interface have to define all method
	//interface can have final and static variable
	
	final int Value=15;
	static int i=20;
	
	abstract void function1();
	int function2(); //by default public
	
}
