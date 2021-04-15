package com.callor.score;

import com.callor.score.service.StudentService;
import com.callor.score.service.Impl.StudentServiceImplV1;

public class studentEx_01 {

	public static void main(String[] args) {
		
		StudentService ssV1 = new StudentServiceImplV1();
		
		ssV1.printStudent();
		System.out.println(ssV1.getStudent("00020"));
	}
}
