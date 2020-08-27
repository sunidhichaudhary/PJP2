package com.sapient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class SubNDays {
	public void subtractTime() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter day");
		int day = in.nextInt();
		System.out.println("enter month");
		int month = in.nextInt();
		System.out.println("enter year");
		int year = in.nextInt();
		System.out.println("enter day to subtract");
		int day2 = in.nextInt();
		System.out.println("enter month to subtract");
		int month2 = in.nextInt();
		Calendar cal = new GregorianCalendar(year, month, day);
	     
		//January starts from 0
	      cal.add(Calendar.MONTH, -month2);
		
		
	      cal.add(Calendar.DAY_OF_MONTH, -day2);
	
	      //Define Format of date
	      SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
	      String date = sdf.format(cal.getTime());
	      System.out.println(date);
	}
}

