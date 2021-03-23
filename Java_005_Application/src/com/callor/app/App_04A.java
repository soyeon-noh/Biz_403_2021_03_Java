package com.callor.app;

import java.util.Random;

public class App_04A {

	public static void main(String[] args) {

		Random rnd = new Random();
		int pizzaBox = 0;

		int intClass1 = rnd.nextInt(10) + 50;
		int intClass2 = rnd.nextInt(10) + 50;
		int intClass3 = rnd.nextInt(10) + 50;
		int intClass4 = rnd.nextInt(10) + 50;
		int intClass5 = rnd.nextInt(10) + 50;

		int intTotal = 0;

		System.out.println("====================================");
		System.out.println("인원수\t피자주문\t전체");
		System.out.println("====================================");

		// 1반
		pizzaBox = intClass1 / 6;
		if (intClass1 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}

		intTotal  = pizzaBox;
		System.out.print(intClass1 + "\t");
		System.out.print(pizzaBox + "\t\t");
		System.out.println(pizzaBox * 6);

		// 2반
		pizzaBox = intClass2 / 6;
		if (intClass2 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}

		intTotal += pizzaBox;
		System.out.print(intClass2 + "\t");
		System.out.print(pizzaBox + "\t\t");
		System.out.println(pizzaBox * 6);

		// 3반
		pizzaBox = intClass3 / 6;
		if (intClass3 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}

		intTotal += pizzaBox;
		System.out.print(intClass3 + "\t");
		System.out.print(pizzaBox + "\t\t");
		System.out.println(pizzaBox * 6);

		// 4반
		pizzaBox = intClass4 / 6;
		if (intClass4 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}

		intTotal += pizzaBox;
		System.out.print(intClass4 + "\t");
		System.out.print(pizzaBox + "\t\t");
		System.out.println(pizzaBox * 6);

		// 5반
		pizzaBox = intClass5 / 6;
		if (intClass5 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}

		intTotal += pizzaBox;
		System.out.print(intClass5 + "\t");
		System.out.print(pizzaBox + "\t\t");
		System.out.println(pizzaBox * 6);

		System.out.println("-------------------------------------");
		System.out.println("전체 주문 BOX 수량: " + intTotal);
	}
}
