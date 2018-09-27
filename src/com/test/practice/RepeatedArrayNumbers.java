package com.test.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatedArrayNumbers {

	public static void main(String[] args) {
		int arr[]={2,1,2,3,5,4,1,6,4,3};
		
		ArrayList<Integer>list=new ArrayList<Integer>(arr.length);
		for(int i:arr){
			list.add(Integer.valueOf(i));
		}
		
		
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int j:list){
			if(map.containsKey(j)){
				map.put(j, map.get(j)+1);
			}
			else
			{
				map.put(j,1);
			}
		}
		System.out.println(map);
		
		

	}

}
