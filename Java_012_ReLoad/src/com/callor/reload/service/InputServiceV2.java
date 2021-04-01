package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	protected Scanner scan; // 아... 또 까먹었다 접근제한자
	protected List<Integer> intList;

	public InputServiceV2() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	public void inputNum() {

		while (true) {
			System.out.println("-".repeat(40));
			System.out.println("50 ~ 150 범위의 정수를 입력해주세요");
			System.out.print(" >> ");
			int intNum = scan.nextInt();
			if (intNum < 50 || intNum > 150) {
				System.out.println(" >> !! 50 ~ 150 범위를 벗어났습니다 !!");
				
			} else {
				intList.add(intNum);
				System.out.println(" >> 입력한 정수 : " + intNum);
			}
		}
	}
}
