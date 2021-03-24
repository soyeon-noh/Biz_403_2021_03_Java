package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {

		int intNums[] = new int[20];

		Random random = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = random.nextInt(100) + 1;
		}

		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 2 == 0) {
				System.out.printf("intNums[%2d] = %3d\n", i, intNums[i]);
			}
		}
	}
}
