package com.sapient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AddNDays {
	   
	   public void addTime() {
		   Scanner in = new Scanner(System.in);
			
			System.out.println("enter day");
			int day = in.nextInt();
			System.out.println("enter month");
			int month = in.nextInt();
			System.out.println("enter year");
			int year = in.nextInt();
			System.out.println("enter day to add");
			int day2 = in.nextInt();
			System.out.println("enter month to add");
			int month2 = in.nextInt();
		   Calendar cal = new GregorianCalendar(year, month, day);
		     
		
		      cal.add(Calendar.MONTH, month2);
		  
		
		      cal.add(Calendar.DAY_OF_MONTH, day2);
		  
		      
		     SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
		      String date = sdf.format(cal.getTime());
		      System.out.println(date);
	   }
	}

