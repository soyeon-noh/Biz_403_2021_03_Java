package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV4 { // V3에서의 배열에 담는 문제 해결하기 위해서 25번줄 부터 수정
								//App_04

	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	Scanner scan;
	
	public ScoreServiceV4(int members) {
		scan = new Scanner(System.in);
		subject = new String[] {"국어","영어","수학"}; // 한줄인경우 new String생략가능
		
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}

	
	public void makeScores() {
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%d 번 학생의 성적입력\n", i + 1);
			intKor[i] = this.inputScore(subject[0]);
			intEng[i]= this.inputScore(subject[1]);
			intMath[i] = this.inputScore(subject[2]);
		}
	}
	
	private Integer inputScore(String sub) {
		
		Integer score = 0;
		while(true){
			System.out.println(sub + " 점수를 입력하세요");
			System.out.print(">> ");
			score = scan.nextInt();
			if(score < 0 || score > 100) {
				System.out.println(sub + " 점수는 0 ~ 100까지만 입력!!");
				// continue;
				// continue 명령을 사용하는 대신 
				// else를 사용하여 코드를 작성할 수도 있음
			}else {
			break;
			} // while에 탈출구가 없으면 무한반복이므로 return이 필요없어져 오류가 난다.
		}
		return score;
	}

}
