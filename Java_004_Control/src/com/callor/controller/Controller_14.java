package com.callor.controller;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int numKor = 0;
		int numEng = 0;
		int numMath = 0;

		int intSum = 0;
		float floatAvg = 0;

		numKor = rnd.nextInt(100) + 1;
		numEng = rnd.nextInt(100) + 1;
		numMath = rnd.nextInt(100) + 1;

		intSum = numKor + numEng + numMath;
		floatAvg = (float) intSum / 3; // 선언을 float로 했었는데 형변환해도 된다.

		System.out.println("==============================");
		System.out.println("국어: " + numKor);
		System.out.println("영어: " + numEng);
		System.out.println("수학: " + numMath);
		System.out.println("------------------------------");
		System.out.printf("총점: %d\t,평균: %.2f\n", intSum, floatAvg);
		System.out.println("==============================");
	}
}
