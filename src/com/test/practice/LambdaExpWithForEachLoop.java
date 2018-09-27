package com.test.practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpWithForEachLoop {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		list.add("Dileep");
		list.add("Manasa");
		list.add("Vanamala");
		list.add("Vykuntam");
		list.add("Honey");
		list.add("Bittu");
		
		list.forEach(
				(n)->System.out.println(n)
				);
	
	}

}
