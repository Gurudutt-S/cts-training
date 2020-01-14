package com.cts.date;

import java.time.Month;
import java.time.YearMonth;

public class YearMonthTest {

	public static void main(String[] args) {
		YearMonth today=YearMonth.now();
		System.out.println("Current month: "+today.getMonthValue());

		
		YearMonth creditExpiry=YearMonth.of(2020, Month.JANUARY);
		System.out.println("your credit card expiry:"+creditExpiry);
	}

}
