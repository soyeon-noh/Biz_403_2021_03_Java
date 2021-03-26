package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String dLines = LinesService.dLines(40);
		String sLines = LinesService.sLines(40);
		
		// 정수 입력
		System.out.println(dLines);
		System.out.println(":: 홀짝 / 소수 판별기 ::");
		System.out.println(" 정수를 입력하고 Enter를 쳐주세요.");
		System.out.print(" 정수 : ");
		int num = scan.nextInt();
		System.out.println(sLines);
		
		// 홀짝 판별
		if(num % 2 == 0) { 
			System.out.println(" 입력한 정수 " + num + "은(는) 짝수입니다.");
		}else {
			System.out.println(" 입력한 정수 " + num + "은(는) 홀수입니다.");
		}
		
		// 소수 판별
		int i = 0;
		for(i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(" 입력한 정수 " + num + "은(는) 소수가 아닙니다.");
				break;
			}
		}
		if(i > num - 1) {
			System.out.println(" 입력한 정수 " + num + "은(는) 소수입니다.");
		}
		System.out.println(dLines);
	}
}
