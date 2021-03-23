package com.callor.app;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random random = new Random();

		int intMembers = 0;
		float floatPizza = 0;
		int pricePizza = 0;
		float eachPay = 0;
		
		intMembers = random.nextInt(26) + 25;
		floatPizza = (float) intMembers / 6.0f;
		pricePizza = 25000;
		
		System.out.println("====================================");
		System.out.println("소수점포함 피자판수: " + floatPizza);

		floatPizza = floatPizza % 1 == 0 ? floatPizza : floatPizza + 1;

		eachPay = floatPizza * pricePizza / 25;
		eachPay = eachPay % 1 == 0 ?  eachPay : eachPay + 1;
		
		System.out.println("====================================");
		System.out.printf("학생 25명이 먹는 피자 조각수: %d\n", intMembers);
		System.out.printf("필요한 피자 판수: %d\n", (int) floatPizza);
		// %.0f 로 하면 버림이 아니라 반올림? 올림? 이 되는 것 같다.
		System.out.println("====================================");
		System.out.printf("개당 피자 가격: %d\n", pricePizza);
		System.out.printf("총 피자 가격: %d\n", pricePizza * (int)floatPizza);
		System.out.printf("명당 지불해야하는 돈: %d\n", (int)eachPay);
		System.out.println("====================================");

	}
}
