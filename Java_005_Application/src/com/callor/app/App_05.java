package com.callor.app;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] stdKor = new int[5];
		int[] stdEng = new int[5];
		int[] stdMath = new int[5];
		
		int[] stdTotals = new int[5];
		float[] stdAvgs = new float[5];
		
		int stdKorSum = 0;
		int stdEngSum = 0;
		int stdMathSum = 0;
		int stdTotalsSum = 0;
			
		System.out.println("===============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
		
		for(int i = 0; i < 5; i++) {
			stdKor[i] = random.nextInt(51) + 50;
			stdEng[i] = random.nextInt(51) + 50;
			stdMath[i] = random.nextInt(51) + 50;
			
			stdTotals[i] = stdKor[i];
			stdTotals[i] += stdEng[i];
			stdTotals[i] += stdMath[i];
			
			stdAvgs[i] = (float)stdTotals[i] / 3;
			
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t\n"
					, i+1, stdKor[i], stdEng[i], stdMath[i], stdTotals[i], stdAvgs[i]);
		
		}
		System.out.println("===============================================");

		for(int i = 0; i < 5; i++) {
			stdKorSum += stdKor[i];
			stdEngSum += stdEng[i];
			stdMathSum += stdMath[i];
			stdTotalsSum += stdTotals[i];
		}
		
		System.out.printf("총점\t%d\t%d\t%d\t%d", stdKorSum, stdEngSum, stdMathSum, stdTotalsSum);
		
	}
}
