package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;


public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

//	@Override
//	public String inputName() {
//		// TODO 이미 입력된 이름인 경우 다시받기
//		while (true) {
//			System.out.println("학생의 이름을 입력하세요(QUIT: 입력중단)");
//			System.out.print(">> ");
//			String inName = scan.nextLine();
//			if (inName.equals("QUIT")) {
//				return null;
//			}
//
//			int exist = 0;
//			for (int i = 0; i < scoreList.size(); i++) {
//				ScoreVO vo = scoreList.get(i);
//				if (vo.getName().equals(inName)) {
//					exist++;
//					break;
//				}
//			}
//
//			if (exist > 0) {
//				System.out.println("이미 입력된 학생입니다 !!!");
//				continue;
//			}
//
//			return inName;
//		}
//	}

	@Override
	public String inputNum() {
		// TODO 이미 입력된 학번인 경우 다시 받기
		while(true) {
			Integer intNum = isV1.inputValue("학번", 1);
			if (intNum == null) {
				return null;
			}
			
			String strNum = String.format("%03d",intNum);
			
			boolean flag = false;
			for(int i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if(vo.getNum().equals(strNum)) {
					flag = true;
					break;
				}
			}
			
			
			if(flag) {
				System.out.println("이미 입력된 학번입니다 !!!");
				continue;
			}
			return strNum;
		}
	}
}
