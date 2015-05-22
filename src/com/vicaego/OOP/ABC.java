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
	
void Print(){	
		System.out.println(a + b);
		System.out.println(Color.RED);
	}

public void function1(){
	
}

public int function2(){
	
	return 0;
}



}
