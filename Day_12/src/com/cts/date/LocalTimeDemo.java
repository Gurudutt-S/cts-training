package com.cts.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		//to check local time
//		LocalTime time=LocalTime.now();
//		System.out.println(time);
		
		
		//add hours in time
//		LocalTime time=LocalTime.now();
//		LocalTime newTime=time.plusHours(2);
//		System.out.println(newTime);
		
		//date and time with time offset
//		LocalDateTime localDateTime=LocalDateTime.of(2016, Month.JANUARY, 10, 11, 30);
//		ZoneOffset zoneOffset=ZoneOffset.of("+05:30");
//		OffsetDateTime offsetDateTime=OffsetDateTime.of(localDateTime, zoneOffset);
//		System.out.println("Local DateTime Zone :"+offsetDateTime);
		
		
		//current timestamp
//		Instant instant=Instant.now();
//		System.out.println("The Current timestamp is :"+instant);
		
		//parsing date in java
//		String birthday="Jan 10 1985";
//		try
//		{
//			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
//			LocalDate birth=LocalDate.parse(birthday, formatter);
//			System.out.printf("The Date %s is formatted in %s %n",birthday,birth);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//converting date to string
		LocalDate arrival=LocalDate.now();
		try
		{
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
			String comming=arrival.format(formatter);
			System.out.printf("The Date %s is formatted in %s %n",arrival,comming);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
