package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

	Scanner scan;

	public NumberServiceV3() {
		scan = new Scanner(System.in);
	}

	public Integer inputNum() {
		String strNum = null;
		Integer intNum = 0;

		while (true) {
			System.out.println("0 ~ 100까지의 정수를 입력해주세요");
			System.out.println("QUIT 입력중단");
			System.out.print(">> ");
			strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				return null;
			}
			
			// 입력 오류 예외처리
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println(
						"숫자를 입력해주세요");
				continue;
			}
			
			// 정수 값의 유효성 검사
			if(intNum < 0 || intNum > 100) {
				System.out.println("범위를 벗어난 값입니다");
				continue;
			}
			
			return intNum;
		}
	}
}
