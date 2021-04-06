package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}
	

	public Integer inputValue(String title) {
		Integer intNum = null;
		String strNum = null;

		while (true) {
			System.out.printf("%s 값을 입력하세요."
					+ " (QUIT : 입력종료)\n", title);
			System.out.print(">> ");
			strNum = scan.nextLine();

			if (strNum.trim().equals("QUIT")) {
				return null;
			}

			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
				continue;
			}
			
			return intNum;
		}
	}
}
