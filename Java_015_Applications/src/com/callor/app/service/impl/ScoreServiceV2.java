package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

// V1에는 ScoreService 인터페이스가 impl 되어있기 때문에
// 		V1을 상속받으면 자동으로 인터페이스도 상속받게 된다.
public class ScoreServiceV2 extends ScoreServiceImplV1{

	@Override
	public String inputName() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("학생의 이름을 입력하세요(QUIT: 입력중단)");
			System.out.print(">> ");
			String inName = scan.nextLine();
			if (inName.equals("QUIT")) {
				return null;
			}
			
			int exist = 0;
			for(int i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);	
				if( vo.getName().equals(inName) ) {
					exist++;
					break;
				}
			}
			
			if(exist > 0) {
				System.out.println("이미 입력된 학생입니다 !!!");
				continue;
			}
			
			return inName;
		}
	}

	
	
	
}
