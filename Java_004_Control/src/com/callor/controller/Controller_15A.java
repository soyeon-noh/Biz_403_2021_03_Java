package com.callor.controller;

import java.util.Random;

public class Controller_15A {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int str1 = 0;
		int str2 = 0;
		int str3 = 0;
		int str4 = 0;
		int str5 = 0;
		int str6 = 0;
		int str7 = 0;
		int str8 = 0;
		int str9 = 0;
		int str10 = 0;
		
		int intSum = 0;
		float floatAvg = 0;
		
		str1 = rnd.nextInt(100) + 1;
		str2 = rnd.nextInt(100) + 1;
		str3 = rnd.nextInt(100) + 1;
		str4 = rnd.nextInt(100) + 1;
		str5 = rnd.nextInt(100) + 1;
		str6 = rnd.nextInt(100) + 1;
		str7 = rnd.nextInt(100) + 1;
		str8 = rnd.nextInt(100) + 1;
		str9 = rnd.nextInt(100) + 1;
		str10 = rnd.nextInt(100) + 1;
		
		intSum = str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8 + str9 + str10;
		floatAvg = intSum / 10;
		
		/*
		 * num 변수와 intKor 이름을 합하여
		 * 		intKor1 ~ intKor5 처럼 만들 수 있을 것 같지만 안된다.
		 * intKornum 이라고 하면 java는 intKornum라는 변수를 찾으려고 시도한다.
		 */
		
		/*
		 * "intKor" + num = rnd.nextInt(100) + 1; => 이런것도 안됨
		 * 그러면 학생이 100명 1000명일 경우엔 어떻게 해야할까? => Array!
		 */
		
		System.out.println("============================");
		System.out.printf("학생  1: %3d\n", str1);
		System.out.printf("학생  2: %3d\n", str2);
		System.out.printf("학생  3: %3d\n", str3);
		System.out.printf("학생  4: %3d\n", str4);
		System.out.printf("학생  5: %3d\n", str5);
		System.out.printf("학생  6: %3d\n", str6);
		System.out.printf("학생  7: %3d\n", str7);
		System.out.printf("학생  8: %3d\n", str8);
		System.out.printf("학생  9: %3d\n", str9);
		System.out.printf("학생 10: %3d\n", str10);
		System.out.println("----------------------------");
		System.out.printf("총점: %d\t, 평균: %.2f\n", intSum, floatAvg);
		System.out.println("============================");
		
	}
}
