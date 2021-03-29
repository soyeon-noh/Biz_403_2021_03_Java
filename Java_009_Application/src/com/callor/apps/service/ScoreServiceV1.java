package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;
	
	int member;
	
	String dLines = LinesService.dLines(45);
	String sLines = LinesService.sLines(45);
	
	public ScoreServiceV1(int member) {
		intKor = new int[member];
		intEng = new int[member];
		intMath = new int[member];
		intTotal = new int[member];
		floatAvg = new float[member];
		
		this.member = member;
	}
	
	public void inputNum() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(dLines);
		System.out.println("::지금부터 성적입력을 시작하겠습니다.::");
		for(int i = 0; i < 5; i++) {
			System.out.println(dLines);
			System.out.printf("::%d번 학생의 점수를 하나씩 입력해주세요.::\n\n", i+1);
			System.out.println(" 국어 점수 입력");
			System.out.print(" >> ");
			intKor[i] = scan.nextInt();
			while(intKor[i] > 100 || intKor[i] < 0) {
				System.out.println(" * 유효하지 않은 성적입니다.");
				System.out.println(" * 다시 입력해주세요.");
				System.out.print(" >> ");
				intKor[i] = scan.nextInt();
			}
			System.out.println(sLines);
			System.out.println(" 영어 점수 입력");
			System.out.print(" >> ");
			intEng[i] = scan.nextInt();
			while(intEng[i] > 100 || intEng[i] < 0) {
				System.out.println(" * 유효하지 않은 성적입니다.");
				System.out.println(" * 다시 입력해주세요.");
				System.out.print(" >> ");
				intEng[i] = scan.nextInt();
			}
			System.out.println(sLines);
			System.out.println(" 수학 점수 입력");
			System.out.print(" >> ");
			intMath[i] = scan.nextInt();
			while(intMath[i] > 100 || intMath[i] < 0) {
				System.out.println(" * 유효하지 않은 성적입니다.");
				System.out.println(" * 다시 입력해주세요.");
				System.out.print(" >> ");
				intMath[i] = scan.nextInt();
			}
		}
	}
	
	public void makeSumAvg() {
		
		for(int i = 0; i < 5; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			
			floatAvg[i] = (float)intTotal[i] / 3;
		}
	}
	
	public void printScore() {
		System.out.println(dLines);
		System.out.println("\t:: 감자학교 성적표 ::");
		System.out.println(sLines);
		System.out.printf("학번\t국어\t수학\t영어\t총합\t평균\n");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%3d\t", i + 1);
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%5.2f\n", floatAvg[i]);
		}
		System.out.println(dLines);
	}
}
