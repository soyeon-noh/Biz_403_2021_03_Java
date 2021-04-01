package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {
//		NumberVO vo = new NumberVO();
// 		여기에 두면 입력을 계속 받을 때 하나의 인스턴스만 갱신된다.
		int num1 = 0;
		int num2 = 0;
		int menu = 0;

		while (true) {
			System.out.println("뺄셈을 진행할 정수 2개를 입력하세요");
			System.out.print("  정수 1 >> ");
			num1 = scan.nextInt();
			while (true) {
				System.out.print("  정수 2 >> ");
				num2 = scan.nextInt();
				if (num1 <= num2) {
					System.out.println("  오류 : 첫번재 정수보다 작은 수를 입력하세요");
					continue;
				}
				break;
			}

			// ★새로운 인스턴스를 반복문 내에서 계속 가져와서 add해야함...
			NumberVO vo = new NumberVO();
			vo.setNum1(num1);
			vo.setNum2(num2);

			numList.add(vo);

			while (true) {
				System.out.println("계속 진행하려면 1,\n" 
								+ "중단하려면 2를 입력하세요.");
				menu = scan.nextInt();
				if (menu < 1 || menu > 2) {
					System.out.println("유효하지 않은 입력입니다.");

				} else if (menu == 2) {
					System.out.println("입력을 종료합니다.");
					return;
				} else {
					break;
				}
			}
		}
	}

	public void printNum() {
		int num1 = 0;
		int num2 = 0;
		int intSub = 0;

		System.out.println("-".repeat(40));
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i); // new가 아니라 있던거 가져옴
			num1 = vo.getNum1();
			num2 = vo.getNum2();
			intSub = num1 - num2;
			System.out.printf("%d - %d = %d\n", num1, num2, intSub);
		}
	}

}
