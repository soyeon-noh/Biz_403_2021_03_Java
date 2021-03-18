package com.callor.var;

public class Varriable_01 {
	public static void main(String[] args) {
		// 변수선언, 초기화
		int num1 = 0;
		int num2 = 0;
		// 데이터 할당
		num1 = 33;
		num2 = 55;
		
		int sum = num1 + num2;
		int minus = num2 - num1;
		int times = num1 * num2;
		int div = num2 / num1;
		
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d - %d = %d\n", num2, num1, minus);
		System.out.printf("%d * %d = %d\n", num1, num2, times);
		System.out.printf("%d / %d = %d\n", num2, num1, div);
		
	}
}
