package com.cts.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;



public class TodayDate {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		
		//to get current date.
//		System.out.println(date);
		
		//to get current date month year
//		int day=date.getDayOfMonth();
//		int month=date.getMonthValue();
//		int year=date.getYear();
//		
//		System.out.println("Day: "+day+" Month: "+month+" Year: "+year);
		
		//to find date after 1 week
//		LocalDate next=date.plus(1, ChronoUnit.WEEKS);
//		System.out.println("Today: "+date);
//		System.out.println("1 week later: "+next);
		
		//to find before and after 1 year
//		LocalDate before=date.minus(1,ChronoUnit.YEARS);
//		LocalDate after=date.plus(1, ChronoUnit.YEARS);
//		System.out.println("Before 1 year: "+before);
//		System.out.println("today: "+date);
//		System.out.println("after 1 year: "+after);
		
		//to check if a date is b4 or aftr .
//		LocalDate tommorow=LocalDate.of(2020, 1, 14);
//		if(date.isBefore(tommorow)) {
//			System.out.println("true");
//		}
//		if(date.isAfter(tommorow)) {
//			System.out.println("True");
//		}
		
		//to print leap year
//		if(date.isLeapYear()) {
//			System.out.println("leap year");
//		}
//		else {
//			System.out.println("Not leap year.");
//		}
		
		LocalDate marriage=LocalDate.of(2023, 12, 3);
		Period months=Period.between(marriage,date );
		System.out.println(months.getMonths());
		
	}

}
