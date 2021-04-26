package com.callor.fine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService{
	// 인터페이스를 임플리먼트 받을 때 implements 라는 키워드를 써야한다
	// 그리고 메서드 를 선언..?해놔야한다.
	
	// 오바라이드 골뱅이 지워도됨
	

	private List<ScoreVO> scoreList;
	private Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	public void inputScore() {
	}

	public void pringList() {
	}
}
