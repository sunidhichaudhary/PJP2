package com.sapient;

import java.text.ParseException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("Press1 For adding a date");
		System.out.println("Press2 For subtracting a date");
		System.out.println("Press3 For for finding day of the week");
		System.out.println("Press4 For finding week of year");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		switch(number) {
		case 1:
			AddNDays add = new AddNDays();
			add.addTime();
			break;
		
		case 2:
			SubNDays sub = new SubNDays();
			sub.subtractTime();
			break;
		case 3:
			DayOfWeek day  = new DayOfWeek();
			day.whichday();
			break;
		case 4:
			DayOfWeek week  = new DayOfWeek();
			week.whichweek();
			break;
		}
		
	}

}
