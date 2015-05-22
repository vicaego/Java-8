package com.vicaego.OOP;

enum Color {
	
	RED,
	BLUE,
	GREEN;
}

public class ABC extends AbstractTest implements myInterface {
	int a;
	int b;
	
	ABC(){
		a=10;
		b=20;		
	}

//abstract function must be implemented
void Print(){	
		System.out.println(a + b);
		System.out.println(Color.RED);
	}

//interface function implemented
public void function1(){
	
}

//interface function implemented
public int function2(){
	
	return 0;
}



}
