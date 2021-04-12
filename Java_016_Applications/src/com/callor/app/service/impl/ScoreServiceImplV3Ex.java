package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.Values;
import com.soyeon.standard.InputService;
import com.soyeon.standard.impl.InputServiceImplV1;

/* 
 * selectMenu는 그대로 활용
 * inputScore() 만 다시 작성
 */
public class ScoreServiceImplV3Ex extends ScoreServiceImplV3{

	// V3에 이미 선언했다면 다시 선언하지 않아도 상관없음, 해도 상관 x
	protected InputService inService;
	protected List<ScoreVO> scoreList; 
	protected Scanner scan;
	
	protected String[] subjectList;
	protected Integer[] subScoreList;
	
	// 과목명, 과목점수가 담긴 배열에 대한 위치를
	// 숫자로 사용하지 않고 명명된 이름으로 사용하기 위하여
	// 배열의 index 값을 상수로 선언해 둔다.
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	// VO는 멤버영영에 선언하는거 주의해야하기 떄문에 선언 x
	
	
	public ScoreServiceImplV3Ex() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		
		subjectList = new String[] {"국어", "영어", "수학"};
		// 아래 코드를 먼저 생성하면 length = 0 이된다. 순서지키기!
		subScoreList = new Integer[ subjectList.length];
	}
	
	@Override
	public void inputScore() {
		Integer intNum = inService.inputValue("학번", 0);
		if(intNum == null) {
			return;
		}
		// 1을 입려했으면 001로 만들어라
		String strNum = String.format("2021%03d", intNum);
		
		String strName = null;
		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT: 입력중단)");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생이름은 반드시 입력하세요");
				continue;
			} 
			break;
		}
		
		// 각 과목의 점수를 별도로 입력받아 변수에 저장하려니 귀찮다.
		// 창조적 게이름을 피워보기
		
		// 입력받을 과목명을 배열 변수로 선언하고
		// String[] subject = {"국어", "영어", "수학"};
		// 		subject 배열을 멤버영역으로 이동함. subjectList로.
		// 		점수를 입력하는 곳에서 사용하기 위하여
		// 		과목명을 담을 배열을 선언했는데
		//		생각해보니 다른 method에서도 사용할 수 있을 것 같다.
		// 		그래서 클래스 영영으로 이동하였다.
		
		
		// 과목수 만큼 점수를 저장할 배열을 선언
		// Integer[] intScore = new Integer[subject.length];
		// 		intScore 배열을 멤버영역으로 이동함. subScoreList로.
		
		for(int i = 0 ; i < subjectList.length; i++) {
			subScoreList[i] = inService.inputValue(subjectList[i], 0, 100);
			if(subScoreList[i] == null) {
				return;
			}
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		
		scoreVO.setKor(subScoreList[ Values.국어 ]);
		scoreVO.setEng(subScoreList[ Values.영어 ]);
		scoreVO.setMath(subScoreList[Values.수학 ]);
		
		// 디버깅 코드, VO에 담긴 데이터 확인하기
		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		scoreList.add(scoreVO);
	}

	@Override
	public void printScore() {
		
		System.out.println("빛나라 고교 성적리스트 2021");
		System.out.println("=".repeat(80));
		
		System.out.print("학번\t");
		System.out.print("이름\t");
		
		for(int index = 0; index < subjectList.length; index++) {
			System.out.print(subjectList[index] + "\t");
		}
		
		System.out.print("총점\t");
		System.out.println("평균");
		System.out.println("-".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(80));
	}

	@Override
	public void saveScore() {

		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print(">> ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다");
				continue;
			} 
			
			FileWriter fileWriter = null;
			PrintWriter out = null;
			
			strFileName = "src/com/callor/app/" + strFileName + ".txt";
			
			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);
				
				/*
				 * 파일에 저장할 때
				 * 각 데이터를 컴마(,)로 구분하여 입력하고
				 * 파일이름을 *.csv로 저장하면
				 * excel에서 파일을 읽을 수 있다.
				 * 
				 * csv : comma-separated-variables
				 * 컴파로 값을 구분한 파일
				 */
				
				int nSize = scoreList.size();
				for(int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + ",");
					out.print(vo.getName() + ",");
					out.print(vo.getKor() + ",");
					out.print(vo.getEng() + ",");
					out.print(vo.getMath() + ",");
					out.print(vo.getTotal() + ",");
					out.println(vo.getAvg());
				}
				out.flush();
				out.close();
				
			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다");
				System.out.println("파일 이름을 다시 입력해 주세요");
				continue;
			}
			return;
		}
	}
}
