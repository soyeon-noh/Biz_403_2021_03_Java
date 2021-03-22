package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		Random rnd = new Random();

		int stdKor = 0;
		int intSum = 0;
		float floatAvg = 0;

		System.out.println("=============================");

		// 이렇게하면 각학생마다 고유한 점수가 남지 않는다. 
		// 점수를 남기려면 변수를 각각 선언하는 15A를 사용하자.
		for (int i = 0; i < 10; i++) {
			int num = i + 1;
			stdKor = rnd.nextInt(100) + 1;
			System.out.printf("학생%2d: %3d\n", num, stdKor);

			intSum += stdKor;
		}

		floatAvg = (float) intSum / 10;

		System.out.println("-----------------------------");
		System.out.printf("총점: %d\t, 평균: %.2f\n", intSum, floatAvg);
		System.out.println("=============================");
	}
}
