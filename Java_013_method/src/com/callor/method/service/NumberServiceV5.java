package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {
	Scanner scan;

	public NumberServiceV5() {
		scan = new Scanner(System.in);
	}

	public Integer inputNum(String title) {
		String strInput = null;
		Integer intNum = 0;

		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(title + " 값을 입력하세요");
			System.out.println("QUIT : 입력취소");
			System.out.print(">> ");
			strInput = scan.nextLine();

			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					System.out.println("※ 숫자만 입력해주세요");
					continue;
				}
			}
			if (intNum < 0 || intNum > 100) {
				System.out.println("※ 범위를 초과했습니다");
				continue;
			}
			return intNum;
		}
	}
}
