package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {
		// TODO 값을 입력받고 오류방지
		String strNum = null;
		Integer intNum = null;
		while (true) {
			System.out.println(title + " 값을 입력하세요");
			System.out.println(">> ");
			strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				return null;
			}

			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("입력오류 : 숫자나 QUIT를 입력하세요");
				continue;
			}
			return intNum;
		}
	}

	public Integer inputValue(String title, int start) {
		// TODO 유효범위 표시 및 유효성 처리(최소점)
		String msgtitle = String.format("%s (%d 이상의 값)", title, start);

		while (true) {
			Integer intNum = inputValue(msgtitle);

			if (intNum == null) {
				System.out.printf("종료");
				return null;
			}
			if (intNum < start) {
				System.out.printf("%d 이상의 값을 입력하세요\n", start);
				continue;
			}
			return intNum;
		}
	}

	public Integer inputValue(String title, int start, int end) {
		// TODO 유효범위 표시 및 유효성 처리(최소점 ~ 최대점)

		String msgtitle = String.format("%s (%d ~ %d)", title, start, end);

		while (true) {
			Integer intNum = this.inputValue(msgtitle);

			if (intNum == null) {
				return null;
			}

			if (intNum < start || intNum > end) {
				System.out.printf("%d ~ %d 범위의 값을 입력하세요.", start, end);
				continue;
			}
			return intNum;
		}

	}
}
