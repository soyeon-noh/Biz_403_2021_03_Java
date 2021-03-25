package com.callor.apps.service;

import java.util.Random;

public class EvenServiceV1 {

	int[] intNum;

	public EvenServiceV1() {
		intNum = new int[100];
	}

	// 1 ~ 100까지의 난수발생
	public void makeNums() {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			intNum[i] = random.nextInt(100) + 1;
		}
	}
	
	
	// 짝수 리스트 출력
	public void printEven() {
		System.out.println("========= 짝수 리스트 =========");
		int nCount = 0;
		for (int i = 0; i < 100; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.printf("%d ", intNum[i]);

				// 리스트 10단위로 끊기
				nCount++;
				if (nCount % 10 == 0) {
					System.out.printf("\n");
				}
			}
		}
		System.out.println("\n-------------------------------");
	}

	// 짝수들의 합 출력
	public void printEvenSum() {
		int evenSum = 0;
		for (int i = 0; i < 100; i++) {
			if (intNum[i] % 2 == 0) {
				evenSum += intNum[i];
			}
		}
		System.out.println("짝수들의 합 : " + evenSum);
	}
}
