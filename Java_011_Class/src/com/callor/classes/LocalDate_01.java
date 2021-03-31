package com.callor.classes;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDate_01 {

	public static void main(String[] args) {
		
		/*
		 * java 1.8 부터 사용할 수 있는
		 * 		새로운 날짜 관련 클래스
		 * 
		 * 기존의 Date, Calendar 클래스가 있는데
		 * 날짜와 관련된 많은 이슈가 발생했다.
		 * 
		 * java 1.8부터 
		 * 		날짜와 시간에 관련된 코딩을 할 때 사용하는 
		 * 		클래스가 새롭게 만들어졌다.
		 */
		LocalDateTime local = LocalDateTime.now(); 
		// 나온지 얼마 안돼서 실무에선 자주 사용하지 않는다.
		// 4~5년전에 1.8이 나옴.. 앞으로는 많이 쓸 수도 있다!
		// Date와 LocalDateTime 두가지를 다 알아두자!
		// Calendar는 안쓴다.
		
		System.out.println(local.toString());
		System.out.println(local.getDayOfMonth()); // 오늘이 이 달의 몇번째 날이냐
		System.out.println(local.getDayOfYear()); // 오늘이 이 해의 몇번째 날이냐
		System.out.println(local.getDayOfWeek()); // 몇요일이냐
		
		System.out.println(local.plusDays(20)); // 오늘부터 20일 후
		System.out.println(local.minusDays(10)); // 오늘부터 10일전
		
		System.out.println(local.plusMonths(1)); // 오늘부터 한달 후 // 31일인데 다음달 30일이라고 나옴.
		
		// 올해 첫날이 며칠이냐
		System.out.println(
		local.with(TemporalAdjusters.firstDayOfNextYear())
		);
		System.out.println(
		local.with(TemporalAdjusters.firstDayOfNextMonth())		
		);
		// 오늘부터 3일 후가 포함된 달의 마지막 날
		System.out.println(
		local.plusDays(3).with(TemporalAdjusters.lastDayOfMonth())		
		);
	}
}
