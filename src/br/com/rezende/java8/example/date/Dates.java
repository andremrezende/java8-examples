package br.com.rezende.java8.example.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Rezende
 *
 */
public class Dates {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		System.out.println(today);
		System.out.println();

		LocalDate olimpics = LocalDate.of(2016, Month.JUNE, 7);
		System.out.println(olimpics);
		System.out.println();

		int years = olimpics.getYear() - today.getYear();
		System.out.println(years);
		System.out.println();
		
		//JDK 8
		Period period = Period.between(today, olimpics);
		System.out.println(period);
		System.out.println("Current");
		
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println("Minus");
		
		System.out.println(today.minusYears(1));
		System.out.println(today.minusMonths(4));
		System.out.println(today.minusDays(2));
		System.out.println("Plus");
		
		System.out.println(today.plusYears(1));
		System.out.println(today.plusMonths(4));
		System.out.println(today.plusDays(2));
		System.out.println("Formatters");
		
		LocalDate nextOlimpics = olimpics.plusYears(4);
		System.out.println(nextOlimpics);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = nextOlimpics.format(formatter);
		System.out.println(valorFormatado);
		System.out.println();
		
		DateTimeFormatter formmaterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(formmaterTime));
		System.out.println("YearMonth");
		
		YearMonth yearMonth = YearMonth.of(2015, Month.JANUARY);
		System.out.println(yearMonth);
		System.out.println("LocalTime");
		
		LocalTime intervall = LocalTime.of(12, 30);
		System.out.println(intervall);
		
	}
}
