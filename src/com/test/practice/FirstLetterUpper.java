package com.test.practice;

import java.util.Arrays;

public class FirstLetterUpper {

	public static void main(String[] args) {
		
		String data="hello my name is dileep";
		String data1[]=data.split(" ");
		
		for(int i=0;i<data1.length;i++)
		{
			String rem=data1[i].substring(0, 1).toUpperCase()+data1[i].substring(1);
			System.out.println(rem);
			
		}
		
}

}
