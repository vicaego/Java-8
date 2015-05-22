package com.vicaego.OOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABC abc = new ABC();
		abc.Print();
		abc.output(); //Abstract class output function
		
		
		
		XYZ xyz = new XYZ();
		xyz.Print();
		xyz.output(); //XYZ class output function because method override
		
		//AbstractTest ab = new AbstractTest(); cannot create object of abstract
		

	}

}
