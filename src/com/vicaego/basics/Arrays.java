package com.vicaego.basics;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		
		for(int i=0;i<5;i++)
			arr[i]=i+1;

		for (int k=0;k<arr.length;k++)
			System.out.println(arr[k]);
		
		//for each
		for(int x: arr )
			System.out.println(x);
		
		//for input
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		System.out.println(y);
		sc.close();
	}

}
