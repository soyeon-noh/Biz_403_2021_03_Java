package com.callor.score.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.soyeon.standard.InputService;
import com.soyeon.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected InputService inServiceV1;
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inServiceV1 = new InputServiceImplV1();
	}
	
	@Override
	public void insertScore() {
		// TODO Auto-generated method stub

		// 학번입력
		Integer intNum;
		String strNum;
		while (true) {
			System.out.println("학번을 입력하세요(QUIT: 입력중단)");
			System.out.print(">> ");
			strNum = scan.nextLine();
			
			// QUIT인지 판별
			if (strNum.equals("QUIT")) {
				System.out.println("입력 취소!!!");
				return;
			}
			
			// 정수인지 판별
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("학번은 정수만 입력가능!!");
				continue;
			} 
			
			
			if (strNum.equals(strNum))
			
			// 5자리 String으로 변환
			strNum = String.format("%05d", intNum);
			
			// 중복확인
			int nSize = scoreList.size();
			for(int i = 0; i < nSize; i++) {
				ScoreVO vo = scoreList.get(i);
				if(vo.equals(strNum)) {
					System.out.println("이미 존재하는 학번!!");
					continue;
				}
			}
			
			break;
		}
		
		// 성적입력
		String[] subject = {"국어", "영어", "수학"};
		Integer[] scores = new Integer[subject.length];
		
		for(int i = 0; i < subject.length; i++) {
			Integer score = inServiceV1.inputValue(subject[i], 0, 100);
			if(score == null){
				return;
			}
			scores[i] = score;
		}

		// 학번과 성적을 VO에 setting하고,	 ArrayList에 add
		ScoreVO vo = new ScoreVO();
		vo.setNum(strNum);
		vo.setKor(scores[국어]);
		vo.setEng(scores[영어]);
		vo.setMath(scores[수학]);
		
		scoreList.add(vo);

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
	}

	
}
