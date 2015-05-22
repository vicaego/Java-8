package com.vicaego.OOP;

public class XYZ extends AbstractTest implements myInterface {
	int x;
	int y;
	
	XYZ(){
		x=20;
		y=40;		
	}
	
	void Print(){
		
		System.out.println(x + y);
	}
	
	public void function1(){
		
	}

	public int function2(){
		
		return 0;
	}
	
	
	@Override
	void output(){
		System.out.println("XYZ class output function");
	}
}
