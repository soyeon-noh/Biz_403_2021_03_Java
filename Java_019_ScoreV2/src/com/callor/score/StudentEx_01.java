package com.callor.score;

import com.callor.score.service.StudentService;
import com.callor.score.service.Impl.StudentServiceImplV1A;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		// 기본값으로 설정된 파일을 사용하여 객체 생성 진행
		StudentService stService 
			= new StudentServiceImplV1A(); 
		
		// (내가 매개변수에 입력한) .../st.txt 파일을 사용하여 객체 생성 진행
		StudentService stService2 
			= new StudentServiceImplV1A(
					"src/com/callor/score/st.txt");
		
		stService.printStudent();
	}
}
