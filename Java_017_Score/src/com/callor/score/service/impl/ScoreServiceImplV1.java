package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.soyeon.standard.InputService;
import com.soyeon.standard.MenuService;
import com.soyeon.standard.impl.InputServiceImplV1;
import com.soyeon.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {


	
	@Override
	public void selectMenu() {
		// TODO soyeonJDK의 MenuService 인터페이스를 사용해 작성

		List<String> menuList = new ArrayList<String>();
		menuList.add("학생정보 등록");
		menuList.add("성적등록");
		menuList.add("성적정보 열기");
		menuList.add("성적정보 저장");
		menuList.add("성적정보 출력");

		MenuService msV1 
		= new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", menuList);

		Integer menu = msV1.selectMenu();

		if (menu == null) {
			System.out.println("시스템 종료");
			return;
		} else if (menu == 1) {
			// 보류
		} else if (menu == 2) {
			this.inputScore();
		} else if (menu == 3) {
			this.readScore();
		} else if (menu == 4) {
			this.saveScore();
		} else if (menu == 5) {
			this.printScore();
		}

	}


	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

}
