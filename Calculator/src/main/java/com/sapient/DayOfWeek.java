package com.sapient;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayOfWeek {
	public void whichday() throws ParseException  {
		System.out.println("enter a date");
		Scanner in = new Scanner(System.in);
		String yourDate  = in.next();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		Date dt1 = (Date) format1.parse(yourDate);
		DateFormat format2 = new SimpleDateFormat("EEEE");
		String finalDay = format2.format(dt1);	
		System.out.println(finalDay);
	}
	
	public void whichweek() throws ParseException {
		System.out.println("enter a date");
		Scanner in = new Scanner(System.in);
		String inputDate  = in.next();
		
		String format = "dd/MM/yyyy";

		SimpleDateFormat df = new SimpleDateFormat(format);
		Date date = df.parse(inputDate);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println(week);
		
	}
}
