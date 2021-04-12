package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.soyeon.standard.InputService;
import com.soyeon.standard.MenuService;
import com.soyeon.standard.impl.InputServiceImplV1;
import com.soyeon.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV3 implements ScoreService{

	protected Scanner scan;
	protected MenuService menuService;
	protected InputService inService;
	protected List<ScoreVO> scoreList;
	protected String[] subject;

	
	public ScoreServiceImplV3() {
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		subject = new String[] {"국어", "영어", "수학"};
	}
	
	@Override
	public void selectMenu() {

		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적리스트 출력");
		scoreMenu.add("성적 저장");
		
		/*
		 * 보통 멤버변수(클래스 영역에 선언된 변수들) 객체는
		 * 이 클래스의 생성자에 만드는 것이 좋다.
		 * 
		 * 하지만 객체를 생성할 때 전달해야할 매개변수(파라메터)에 대하여
		 * 수행해야할 연산코드가 있을 경우는
		 * 객체를 사용하기 전에 객체를 생성하는 코드를 작성해도 된다.
		 */
		// 보통 생성자에서 생성하는데
		// 어떠한 데이터를 만들거나 연산해야할 때는 다른 곳에서 생성한다.
		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무 종료!!!");
				break;
			}
			if(menu == 1) {
				this.inputScore();
			}else if(menu == 2) {
				this.printScore();
			}else if(menu == 3) {
				this.saveScore();
			}
			
		}
	}
	
	public String inputNum() {
		Integer intNum = inService.inputValue("학번", 0);
		if(intNum == null) {
			return null;
		}
		String strNum = String.format("2021%03d", intNum);
		return strNum;
	}
	
	public String inputName() {
		System.out.println("이름을 입력하세요(QUIT: 입력중단)");
		System.out.print(">> ");
		String strName = scan.nextLine();
		if(strName.equals("QUIT")) {
			System.out.println("입력 취소!!!");
			return null;
		} else {
			return strName;
		}
		
	}

	@Override
	public void inputScore() {
		// 학번입력, 이름입력, 과목별 성적 입력
		// ScoreVO 객체에 담고, list 에 추가
		// = ScoreVO 클래스를 사용하여 생성한 scoreVO 객체에 담고
		// = scoreVO 에 담고
		

		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		
		String strName = this.inputName();
		if(strName == null) {
			return;
		}
		
		
		Integer[] score = new Integer[subject.length];
		for(int i = 0; i < subject.length; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
			if(score[i] == null) {
				return;
			}
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setNum(strNum);
		vo.setName(strName);
		vo.setKor(score[0]);
		vo.setKor(score[1]);
		vo.setKor(score[2]);
		
		scoreList.add(vo);
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		while (true) {
			// TODO Auto-generated method stub
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print(">> ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다");
				continue;
			}
			
		}
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
