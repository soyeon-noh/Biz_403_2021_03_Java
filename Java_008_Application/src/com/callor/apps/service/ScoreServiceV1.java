package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	int member;
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intTotal;
	float[] floatAvg;

	String dLines = LinesService.dLines(47); // 이거 생성자메소드에 넣었는데 안됐었음
	String sLines = LinesService.sLines(47); // 인스턴스 변수에 해야하나봄
	
	public ScoreServiceV1(int member) {
		intKor = new int[member];
		intEng = new int[member];
		intMath = new int[member];
		
		intTotal = new int[member]; 
		floatAvg = new float[member]; 
		
		this.member = member; // ★매개변수 이렇게 선언하면 된대!
	}
	
	public void inputScore() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(dLines);
		System.out.println("지금부터 각 과목별 점수입력을 시작하겠습니다.");
		System.out.println("점수를 입력하고 Enter를 눌러주세요.");
		
		for(int i = 0; i < member; i++) {
			System.out.println(sLines);
			System.out.printf("::%d번 학생의 점수를 입력하세요::\n", i+1);
			
			System.out.printf(" %d번 학생 국어 점수\n", i+1);
			System.out.print(" >> ");
			intKor[i] = scan.nextInt();
			System.out.printf(" %d번 학생 영어 점수\n", i+1);
			System.out.print(" >> ");
			intEng[i] = scan.nextInt();
			System.out.printf(" %d번 학생 수학 점수\n", i+1);
			System.out.print(" >> ");
			intMath[i] = scan.nextInt();
		}
		
// 이렇게하면 한과목점수를 전부다 받고 다음과목으로 넘어감.
//
//		System.out.println(sLines);
//		System.out.println("::영어점수을 입력하세요::");
//		for(int i = 0; i < member; i++) {
//			System.out.printf(" %d번 학생 영어 점수\n", i+1);
//			System.out.print(" >> ");
//			intEng[i] = scan.nextInt();
//		}
//		
//		System.out.println(sLines);
//		System.out.println("::수학점수을 입력하세요::");
//		for(int i = 0; i < member; i++) {
//			System.out.printf(" %d번 학생 수학 점수\n", i+1);
//			System.out.print(" >> ");
//			intMath[i] = scan.nextInt();
//		}
	}
	
	public void makeSum() {
		for(int i = 0; i < member; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];	
		}
	}
	
	public void makeAvg() {
		int nSubject = 3;
		
		for(int i = 0; i < member; i++) {
			floatAvg[i] = (float)intTotal[i] / nSubject;
		}
	}
	
	public void printScore() {
		
		System.out.println(dLines);
		System.out.println("\t::한국 고등학교 성적표::");
		System.out.println(sLines);
		System.out.printf("학번\t국어\t영어\t수학\t총합\t평균\n");
		for(int i = 0; i < member; i++) {
			System.out.printf("%3d\t", i+1);
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%7.2f\n", floatAvg[i]); //왜 정렬이 안맞지?
		}
		System.out.println(dLines);
	}
}
