package com.test.practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddOneMonthToCurrentDate {

	public static void main(String[] args) {
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=Calendar.getInstance();
		String today=dateFormat.format(cal.getTime());
		System.out.println(today);
		cal.add(Calendar.MONTH, 1);
		String onemonthdate=dateFormat.format(cal.getTime());
		System.out.println(onemonthdate);
		
		cal.add(Calendar.YEAR, 1);
		String oneyeardate=dateFormat.format(cal.getTime());
		System.out.println(oneyeardate);
	}

}
