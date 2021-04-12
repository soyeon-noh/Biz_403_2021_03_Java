package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceImplV2 implements ScoreService {

	Scanner scan;
	
	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public void selectMenu() {
		while (true) {
			// TODO Auto-generated method stub
			System.out.println("=".repeat(50));
			System.out.println("빛고을 고교 성적처리 2021");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적저장");
			System.out.println("QUIT.종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택>> ");
			String strMenu = scan.nextLine();
			if (strMenu.trim().equals("QUIT")) {
				System.out.println("업무종료");
				return;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("메뉴에 해당되는 숫자나 QUIT를 입력해주세요");
				continue;
			} 
			
			if(intMenu == 1) {
				this.inputScore();
			}else if(intMenu == 2) {
				this.printScore();
			}else if(intMenu == 3) {
				this.saveScore();
			}else {
				System.out.println("메뉴에 해당되는 숫자나 QUIT를 입력해주세요");
				continue;
			}
		}
		
		
		

		
		

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

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
