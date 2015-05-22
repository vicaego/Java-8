package com.vicaego.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List interface
		//ArrayList can contain duplicate values
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Monday");
		arr.add("Tuesday");
		arr.add("Wednesday");
		arr.add("Thursday");
		arr.add("Saturday");
		arr.add("Saturday");
		arr.add("Sunday");
		
		//insert
		arr.add(4,"Friday");
		//remove
		System.out.println(arr.remove(5)+" Removed");
	
		//Iterator
		Iterator<String> it = arr.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		//output
		System.out.println(arr);
		
		//for each
		for(String str: arr)
			System.out.println(str);
		
	
	}

}
