package com.vicaego.OOP;

public class XYZ extends AbstractTest implements myInterface {
	int x;
	int y;
	
	XYZ(){
		x=20;
		y=40;		
	}
	
	//abstract function must be implemented
	void Print(){
		System.out.println(x + y);
	}
	
	//interface function implemented
	public void function1(){
		
	}

	//interface function implemented
	public int function2(){
		
		return 0;
	}
	

	//overide abstract class method
	@Override
	void output(){
		System.out.println("XYZ class output function");
	}
}
