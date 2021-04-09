package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1A implements ScoreService {

	protected Scanner scan;
	
	public ScoreServiceImplV1A() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public void selectMenu() {
		// TODO 성적처리 메뉴선택
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("QUIT. 업무 종료");
			String strM = scan.nextLine();
			if(strM.equals("QUIT")) {
				break;
//				System.out.println("업무종료");
//				return;
			}
			Integer intM = null;
			
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.println("메뉴는 정수 QUIT만 입력");
			}
			if(intM == 1) {
				this.inputScore();
			}
		}
		
	}

	@Override
	public String inputName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printSocre() {
		// TODO Auto-generated method stub
		
	}

}
