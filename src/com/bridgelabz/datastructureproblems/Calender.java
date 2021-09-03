package com.bridgelabz.datastructureproblems;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.Arrays;

public class Calender {

	public static void main(String[] args) {
		String[][] calendar = new String[7][7];
		Year year = Year.of(2021);
		Month month = Month.JANUARY;
		YearMonth yearMonth = YearMonth.of(year.getValue(), month);
		DayOfWeek firstDayWeek = yearMonth.atDay(1).getDayOfWeek();
		int firstDayWeekValue = firstDayWeek.getValue();
		int max = yearMonth.lengthOfMonth();
		String[] current = calendar[0];

		for (int i = 0; i < 7; i++) {
			current[i] = DayOfWeek.of(i + 1).toString().substring(0, 3);
		}
		current = calendar[1];
		Arrays.fill(current, " .");
		boolean started = false;
		int day = 1;

		for (int i = 0; i < 7; i++) {
			if (firstDayWeekValue == (i + 1)) {
				started = true;
			}
			if (started) {
				current[i] = "  " + day++;
			}
		}

		for (int i = 2; i < 7; i++) {
			current = calendar[i];
			for (int j = 0; j < 7; j++) {
				if (day > max) {
					Arrays.fill(current, j, 7, " .");
					break;
				}
				current[j] = " " + day++;
			}
		}
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(calendar[i][j] + "  ");
			}
			System.out.println(" ");
		}

	}

}
