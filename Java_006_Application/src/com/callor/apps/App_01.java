package com.callor.apps;

/*
 * 정수형 배열을 20개 선언
 * 짝수들의 리스트 출력
 * 짝수들의 합을 계산하여 출력
 */
import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] intNum = new int[20];
		int evenSum = 0;

		System.out.println("=========== 짝수 리스트 ============");

		for (int i = 0; i < 20; i++) {
			intNum[i] = random.nextInt(100) + 1;
		}

		for (int i = 0; i < 20; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.print(intNum[i] + " ");
			}
		}

		int i = 0;
		while(i < 20) {
			evenSum += intNum[i];
			i++;
		}
		
		System.out.println();
		System.out.println("====================================");
		System.out.println("짝수들의 합 : " + evenSum);
	
	}
}

