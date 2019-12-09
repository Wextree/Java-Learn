package javalearn;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Canlendar {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		int month  = date.getMonthValue();
		int today  = date.getDayOfMonth();
		// System.out.printf("month:%2d, date:%2d",month,today);
		
		date = date.minusDays(today-1); // Set to start of month
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		System.out.printf("%d,%d\n",date.getDayOfMonth(),value);
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		// fit the dates of last month with spaces
		for(int i = 1;i < value;i++ ) {
			System.out.print("    ");
		}
		while(date.getMonthValue() == month) {
			System.out.printf("%3d", date.getDayOfMonth());
			if(date.getDayOfMonth() == today) {
				// 对当天进行一个标识
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			date = date.plusDays(1);
			 // 如果到达星期一，换行
			if(date.getDayOfWeek().getValue() == 1) System.out.println();
		}
		if(date.getDayOfWeek().getValue() != 1) System.out.println();
		
		
	}
}
