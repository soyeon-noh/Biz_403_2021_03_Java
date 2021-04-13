package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.soyeon.standard.InputService;
import com.soyeon.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected InputService inService;
	protected String[] subName;
	protected Integer[] subScore;
	protected Scanner scan;
	protected List<ScoreVO> scoreList;

	
	public ScoreServiceImplV2() {
		inService = new InputServiceImplV1();
		subName = new String[] { "국어", "영어", "수학" };
		subScore = new Integer[subName.length];
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
		// 학번 입력받기
		Integer intNum = inService.inputValue("학번", 1);
		String strNum = String.format("2021%03d", intNum);

		// 이름 입력받기
		System.out.println("이름을 입력하세요(QUIT: 입력중단)");
		System.out.print(">> ");
		String name = scan.nextLine();
		if(name.equals("QUIT")) {
			System.out.println("입력 취소!!!");
			return;
		}
		
		// 과목 3개 입력받기
		for (int i = 0; i < subName.length; i++) {
			Integer score = inService.inputValue(subName[i], 0, 100);
			if (score == null) {
				return;
			}
			
			subScore[i] = score;
		}
		// 이름, 학번, 과목점수 ArrayList에 추가하기
		ScoreVO vo = new ScoreVO();
		vo.setNum(strNum);
		vo.setName(name);
		vo.setKor(subScore[0]);
		vo.setEng(subScore[1]);
		vo.setMath(subScore[2]);

		scoreList.add(vo);
	}
}