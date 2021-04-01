package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV4() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {
		Integer scanNum1 = 0;
		Integer scanNum2 = 0;

		System.out.println("=".repeat(40));
		System.out.println("정수 2개를 입력하세요");
		System.out.print(" 정수 1 >> ");
		scanNum1 = scan.nextInt();
		System.out.print(" 정수 2 >> ");
		scanNum2 = scan.nextInt();

		// 객체가 자료형인 ArrayList는
		// 먼저 VO 인스턴스를 선언하고
		// 거기서 get, set으로 읽거나 추가한다.
		NumberVO vo = new NumberVO();
		vo.setNum1(scanNum1);
		vo.setNum2(scanNum2);

		// 객체의 해당 인스턴스를! 통으로! 리스트에 add 하는 것!
		numList.add(vo);

	}

	public void printNum() {
		System.out.println("-".repeat(40));
		System.out.println("입력한 정수 리스트");
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			System.out.print(vo.getNum1() + "\t");
			System.out.println(vo.getNum2());
			
//			System.out.print(numList.get(i).getNum1() + "\t");
//			System.out.println(numList.get(i).getNum2());
			// 나는 이렇게 했는데 더 헷갈린다.
		}

	}
}
