package com.test.practice;

public class Page {

	
	 public static String getPageClassName(String pageClassName) {
	        return Page.class.getName().replace("com.test.practice", "pages." + pageClassName.replace(" ", "."));
	    }
	public static void main(String[] args) {
		System.out.println(getPageClassName("OpenCart AccountSuccess"));
		
	}

}
