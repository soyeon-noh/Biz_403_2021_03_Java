package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

public class ScoreServiceV1 {

/*
 * 접근제한자(참조제한자)
 * public, private, protected
 * 
 * class, method, 멤버변수를 선언할 때 사용하는 Keyword
 * 접근제한자는 사용하지 않아도
 * 		문법적인 오류가 발생하지는 않는다.
 * 객체이론의
 * 		"정보은닉
 * 			(감춘다, 
 * 			제한적으로 접근하게 한다, 
 * 			데이터를 보호한다)"
 * 
 * public : 모두에게 개방한다. 모두에게 공개한다.
 * 			누구나 접근(읽기, 쓰기, 실행)을 하게 한다
 * 			Class obj = new Class();
 * 			obj.method();  //객체를 통해서 메서드에 접근
 * 			obj.변수 = 100;	//객체를 통해서 변수에 접근
 * 
 * private : 현재 파일에 있는 코드에서만 접근 가능
 * 			obj.변수 = 100; // 문법오류가 난다.
 * 
 * protected : 생성된 객체를 통해서는 직접 접근금지
 * 			Class obj = new Class(); 
 * 			obj.method() 방식으로는 접근이 안된다.
 * 			클래스를 상속받게 하겠다 라는 전제하에 
 * 			상속을 받은 클래스에서는 자유롭게 접근 가능
 * 
 * 			부모클래스와 상속받은 자식클래스 간에 공유하는 목적
 * 			
 */
	
	/*
	 * 멤버변수를 protected로 선언을 해 두면
	 * 현재클래스(V1)를 상속받은 자식 클래스에서
	 * 변수가 선언된 것처럼 동작할 수 있다.
	 * 
	 * 상속을 허락하고, 멤버변수를 공유하고자 할때는
	 * protected를 추가한다.
	 * 
	 */
	protected Scanner scan; // 클래스 변수를 그냥 냅두면 작동을 잘못할 위험이 있어서 private를 해야하는데
	protected List<ScoreVO> scoreList;  // 그러면 상속한 클래스에서도 사용을 못함 -> protected 사용으로 해결
	
	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}
	
	public Integer inputScore() {
		
//		System.out.println("학번을 001 형식으로 입력하세요");
//		System.out.print(">> ");
//		String strNum = scan.next(); // 키보드로 입력받기

		/*
		 * scoreList의 데이터 개수를 계산하여
		 * 입력할 학번을 자동으로 생성하기
		 */
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);
		
		int intKor = 0;
		while(true) {
			System.out.println(strNum + " 번의 국어점수를 입력하세요(중단: -1)");
			System.out.print(">> ");
			intKor = scan.nextInt();
			if(intKor == -1) {
				return -1;
			}else if(intKor < 0 || intKor > 100) {
				System.out.println("국어점수는 0 ~ 100 까지!!");
				continue;
			}
			break;
		}
		
		System.out.println(strNum + " 번의 영어점수를 입력하세요");
		System.out.print(">> ");
		int intEng = scan.nextInt();
		
		System.out.println(strNum + " 번의 수학점수를 입력하세요");
		System.out.print(">> ");
		int intMath = scan.nextInt();
		
		ScoreVO scoreVO = new ScoreVO(); // ScoreVO 객체에 추가
		scoreVO.num = strNum;
		scoreVO.kor = intKor;
		scoreVO.eng = intEng;
		scoreVO.math = intMath;
		scoreList.add(scoreVO); // 리스트에 추가
		
		return 0;
	} // inputScore()
	
	public void printScore() {
		
		this.printHeader(); // 헤더는 별도로 만들어 호출
		
		for(int i = 0; i < scoreList.size(); i++) {
			// scorelist의 i 번째 저장된 값을 읽어서
			// ScoreVO 형 sVO 객체에 담기
			ScoreVO sVO = scoreList.get(i);
			
			System.out.print(sVO.num + "\t");
			System.out.print(sVO.kor+ "\t");
			System.out.print(sVO.eng+ "\t");
			System.out.print(sVO.math+ "\t");
			System.out.println();
		}
	} // pirntScore()
	
	private void printHeader() {
		System.out.println("* 빛나라 고교 성적처리 V1");
		System.out.println(Lines.dLine(50));
		System.out.print("학번\t국어\t영어\t수학\t총점\t평균\t석차\n");
		System.out.println(Lines.sLine(50));
	}
}
















