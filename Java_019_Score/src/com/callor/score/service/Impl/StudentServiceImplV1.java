package com.callor.score.service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList; // protected 잊지 말기
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
	

	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		
		this.loadStudent(); // 생성자에 메서드 호출
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub

		String studentFile = "src/com/callor/score/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break; // 왜 .equals(null)은 오류가 뜨지?

				String[] students = reader.split(":"); // 크기는 어떻게되는거지?

				StudentVO vo = new StudentVO();
				vo.setNum(students[학번]);
				vo.setName(students[이름]);
				vo.setGrade(students[학년]);
				vo.setDept(students[학과]);
				vo.setAddress(students[주소]);
				studentList.add(vo);
			}
			buffer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 여는동안 문제 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일에서 데이터 읽는 중 문제 발생");
		}

//		테스트 코드
		for(int i = 0; i < 200; i++) {
			System.out.println(studentList.get(i).toString());	
		}

	}

	@Override
	public StudentVO getStudent(String num) {

		int nSize = studentList.size();
		for (int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			if (num.equals(vo.getNum())) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void printStudent() {

		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t주소");
		System.out.println("-".repeat(80));
		
		// 와 이거 멤버변수로 선언하면 안됨; 0으로 고정되는 듯
		int nSize = studentList.size(); 
		for(int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getAddress() + "\n");
		}
		
		System.out.println("=".repeat(80));
	}

}
