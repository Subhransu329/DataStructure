package com.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatExample {
	public static void main(String[] args) {
		
		
		try {
			String date ="2024-01-02 05:20:01.0";
			
			DateTimeFormatter dtformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
			LocalDateTime localDate = LocalDateTime.parse(date, dtformatter);
			
			System.out.println("befor convort"+localDate);
			DateTimeFormatter dtformatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
			String date2 = localDate.format(dtformatter1);
			System.out.println(date2);
		}catch (DateTimeParseException e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
