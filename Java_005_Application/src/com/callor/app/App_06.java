package com.callor.app;

public class App_06 {

	public static void main(String[] args) {

		int nPay = 0;
		nPay = 3_723_560;

		int[] nPaper = new int[8];
		int divNum = 0;
		divNum = 50000;

		System.out.println("============================");
		System.out.println("급여수령액 : 3,723,560");
		System.out.println("============================");

		for (int i = 0; i < 8; i++) {

			nPaper[i] = nPay / divNum;
			nPay %= divNum;

			System.out.printf("%6d 원권\t%5d매\n", divNum, nPaper[i]);

			if (i % 2 == 0) {
				divNum /= 5;
			} else
				divNum /= 2;

		}

		System.out.println("============================");
		

	}
}
