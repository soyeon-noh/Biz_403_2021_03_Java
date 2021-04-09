package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.soyeon.standard.InputService;
import com.soyeon.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	Scanner scan;
	List<ScoreVO> scoreList;
	InputService isV1;

	String[] subject;
	Integer[] score;
	
	int line;
	
	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		isV1 = new InputServiceImplV1();

		subject = new String[] { "국어", "영어", "수학" };
		score = new Integer[subject.length];
		line = 55;
	}

	@Override
	public void selectMenu() {
		// TODO 메뉴
		while (true) {
			System.out.println("=".repeat(line));
			System.out.println("성적입력 시스템");
			System.out.println("-".repeat(line));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("0. 업무종료");
			System.out.println("-".repeat(line));
			System.out.print("업무선택 >> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("1")) {
				this.inputScore();
			} else if (strMenu.equals("2")) {
				this.printSocre();
			} else if (strMenu.equals("0")) {
				System.out.println("+ * ".repeat(7));
				System.out.println("+ *  업무를 종료합니다  + *");
				System.out.println("+ * ".repeat(7));
				return;
			} else {
				System.out.println("잘못된 입력!!!");
				continue;
			}
		}

	}

	public String inputNum() {
		// TODO 학생의 학번을 입력받고 학번을 return (null 중단)
		Integer intNum = isV1.inputValue("학번", 1);
		if (intNum == null) {
			return null;
		}
		String strNum = String.format("%03d", intNum);
		return strNum;
	}

	@Override
	public String inputName() {
		// TODO 학생의 이름을 입력받고 이름을 return (null 중단)
		System.out.println("학생의 이름을 입력하세요(QUIT: 입력중단)");
		System.out.print(">> ");
		String inName = scan.nextLine();
		if (inName.equals("QUIT")) {
			return null;
		}
		return inName;
	}

	public Integer checkNum(String num, String name) {
		// TODO 학번과 이름이 맞는지 확인하고 맞으면 1, 아니면 0 return
		while (true) {
			System.out.println(num + "번 " + name + "학생이 맞습니까?");
			System.out.println("( 계속 진행 : 1, 다시 입력 : 0 )");
			String check = scan.nextLine();
			if (check.trim().equals("0")) {
				return 0;
			} else if (check.trim().equals("1")) {
				System.out.println("-".repeat(line));
				System.out.println(num +"번 " + name + "학생의 성적입력을 시작합니다");
				return 1;
			} else {
				continue;
			}
		}
	}

	@Override
	public void inputScore() {
		// TODO 학생의 국영수 성적을 입력받고 ArrayList에 추가 (무한반복)

		while (true) {
			System.out.println("=".repeat(line));

			// 학번 입력 : this.inputNum()
			String stdNum = this.inputNum();
			if (stdNum == null) {
				return;
			}


			// 이름 입력 : this.inputName()
			String stdName = this.inputName();
			if (stdName == null) {
				System.out.println("입력 취소!!!");
				return;
			}

			// 학번 이름 확인 : this.checkNum()
			int check = this.checkNum(stdNum, stdName);
			if (check == 0) {
				continue;
			}

			// 점수 입력 : isV1.inputValue( s, d, d )
			for (int j = 0; j < subject.length; j++) {
				score[j] = isV1.inputValue(subject[j], 0, 100);
				if (score[j] == null) {
					System.out.println("입력 취소!!!");
					return;
				}
			}

			// ArrayList에 추가
			ScoreVO VO = new ScoreVO();
			VO.setNum(stdNum);
			VO.setName(stdName);

			VO.setKor(score[0]);
			VO.setEng(score[1]);
			VO.setMath(score[2]);
			
			scoreList.add(VO);
		} // end while
	}
	

	@Override
	public void printSocre() {
		// TODO 성적표 출력 scoreList.get()

		System.out.println("=".repeat(line));
		System.out.println("성적리스트");
		System.out.println("-".repeat(line));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총합\t평균");
		for (int i = 0; i < scoreList.size(); i++) {
			System.out.printf("%3s\t", scoreList.get(i).getNum());
			System.out.printf("%3s\t", scoreList.get(i).getName());
			System.out.printf("%3d\t", scoreList.get(i).getKor());
			System.out.printf("%3d\t", scoreList.get(i).getEng());
			System.out.printf("%3d\t", scoreList.get(i).getMath());
			System.out.printf("%3d\t", scoreList.get(i).getTotal());
			System.out.printf("%5.2f\n", scoreList.get(i).getAvg());
		}
	}

}
