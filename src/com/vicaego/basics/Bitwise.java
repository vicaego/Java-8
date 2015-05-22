/**
 * 
 */
package com.vicaego.basics;

/**
 * @author vicaego
 * http://www.tutorialspoint.com/java/java_basic_operators.htm
 *
 */
public class Bitwise {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a=60; //binary 0011 1100
		int b=13; //binary 0000 1101
		
		//Binary AND Operator copies a bit to the result if it exists in both operands.
		//(A & B) will give 12 which is 0000 1100
		System.out.println(a&b); 
		
		//Binary OR Operator copies a bit if it exists in either operand.
		//(A | B) will give 61 which is 0011 1101
		System.out.println(a|b); //
		
		//Binary XOR Operator copies the bit if it is set in one operand but not both.
		//(A ^ B) will give 49 which is 0011 0001
		System.out.println(a^b);
		
		//Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.
		//(~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.
		System.out.println(~a);
		
		//Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
		//A >> 2 will give 15 which is 1111
		System.out.println(a>>2);
		
		//Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operan
		//A << 2 will give 240 which is 1111 0000
		System.out.println(a<<1);
		
		//Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.
		//A >>>2 will give 15 which is 0000 1111
		System.out.println(a>>>1);
		
		
		//Conditional operator
		if(a>b)
			System.out.println("a is greater");
		else
			System.out.println("b is greater");
		
		//?: Ternary operator
		System.out.println( (a>b)? "a is greater":"b is greater");

	}

}
