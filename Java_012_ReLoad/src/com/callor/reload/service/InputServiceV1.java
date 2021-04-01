package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV1 { // 접근제한자 붙여서 선언하기!!

	protected List<Integer> intList;
	protected Scanner scan;

	public InputServiceV1() {
		intList = new ArrayList<Integer>();
		scan = new Scanner(System.in);
	}

	public void inputNum() {
		Integer num = 0;
		
		while (true) {
			System.out.println("정수를 입력하시오.(QUIT: -1)");
			System.out.print("  >> ");
			num = scan.nextInt();
			
			if(num == -1) {
				System.out.println(":::::: 프로그램을 종료합니다 ::::::");
				break;
			}else {
				System.out.println("  >> " + num + "이(가) 리스트에 추가되었습니다.");
			}
			
			intList.add(num);
		}
		
		this.printNum();
	}

	public void printNum() {
		int line = 35;
		System.out.println("=".repeat(line));
		System.out.println("\t정수 리스트");
		System.out.println("-".repeat(line));
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
		System.out.println();
		System.out.println("=".repeat(line));
	}
}
