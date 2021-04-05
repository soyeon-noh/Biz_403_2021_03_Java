package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2 {

	Scanner scan;

	public NumberServiceV2() {
		scan = new Scanner(System.in);
	}

	public Integer inputNum() {
		Integer intNum = 0;

		while (true) {
			System.out.println("0 ~ 100까지 정수를 입력해주세요");
			System.out.println("(입력중지 : QUIT)");
			System.out.print(">> ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				return null;
			}
			
			intNum = Integer.valueOf(strNum);

//			try {
//				intNum = Integer.valueOf(strNum);
//			} catch (Exception e) {
//				System.out.println("잘못된 입력입니다");
//				continue;
//			}
			
			if( intNum < 0 || intNum > 100) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			return intNum;
		}
	}
}
