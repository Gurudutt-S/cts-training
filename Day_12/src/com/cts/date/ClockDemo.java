package com.cts.date;

import java.time.Clock;

public class ClockDemo {

	public static void main(String[] args) {
		//current time using clock
		Clock clock=Clock.systemUTC();
		System.out.println(clock);
		
		Clock clock1=Clock.systemDefaultZone();
		System.out.println(clock1);

	}

}
