package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {
		
		int lineLength = 35;
		
		Scanner scan = new Scanner(System.in);
		String dLines = LinesService.dLines(lineLength);
		String sLines = LinesService.sLines(lineLength);
		
		int[] intNum = new int[5];
		int intSum = 0;
		
		System.out.println(dLines);
		System.out.println(":: 다섯 정수의 합 구하기 ::");
		System.out.println(" 더하고 싶은 정수 5개를\n 하나씩 입력하고\n Enter를 쳐주세요.");
		System.out.println(sLines);
		
		for(int i = 0; i < 5; i++) { // 정수 5개 입력받기
			System.out.printf(" 정수%d : ", i + 1);
			intNum[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 5; i++) { // 정수 5개 합 구하기
			intSum += intNum[i];
		}
		
		System.out.println(sLines);
		System.out.println(":: 계산 결과 ::");
		System.out.print(" 입력한 정수 5개 : ");
		for(int i = 0; i < 5; i++) { // 정수 5개 리스트 출력
			System.out.printf("%d  ", intNum[i]);
		}
		System.out.println("\n 정수들의 합 : " + intSum); // 정수 5개 합 출력
		System.out.println(dLines);
	}
}
