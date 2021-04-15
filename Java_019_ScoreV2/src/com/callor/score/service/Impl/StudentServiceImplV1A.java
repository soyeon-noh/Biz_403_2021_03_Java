package com.callor.score.service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1A implements StudentService {

	protected List<StudentVO> studentList; // 상속을 대비해 protected로. 필요없으면 private
	protected String studentFile;

	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;

	/*
	 * new StudentServiceImplV1() 생성자를 호출하여 객체를 생성하려고 하면 고정된
	 * 파일이름("src/com/callor/score/student.txt")을 사용하여 파일을 읽을 수 있도록 할 예정이다.
	 * 
	 * 생성자에서는 new StudentServiceImplV1("파일명")의 생성자 method를 다시 호출하는 구조가 된다.
	 */

	public StudentServiceImplV1A() {
		// 여기에서 다음의 생성자 method를 또한번 호출
		// new StudentServiceImplV1A("src/com/callor/score/student.txt");

		// this method는 자기자신과 같은 이름이 같은 또다른 생성자를 호출한다.
		this("src/com/callor/score/student.txt");
	}

	// 매개변수가 있는 두번째 생성자 method
	// 매개변수가 있든 없든 실행된다.
	public StudentServiceImplV1A(String fileName) {
		this.studentFile = fileName;

		studentList = new ArrayList<StudentVO>();

		// 클래스를 객체로 생성할 때 method를 호출하여
		// 데이터를 사용하도록 준비해 달라
		this.loadStudent();

	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	/*
	 * student.txt 파일에서 학생정보를 읽어 studentList 에 데이터 준비하기
	 */
	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				// 파일로부터 읽은 값이 null
				// EOF(End of File)에 다다랐다
				if (reader == null)
					break;
				String[] sts = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(sts[학번]);
				studentVO.setName(sts[이름]);
				studentVO.setGrade(sts[학년]);
				studentVO.setDept(sts[학과]);
				studentVO.setAddress(sts[주소]);
				// Debugin code
				// System.out.println(studentVO.toString());
				studentList.add(studentVO);
			}
			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println(this.studentFile + " 파일이 없습니다");
		} catch (IOException e) {
			System.out.println("파일을 읽는 동안 문제 발생");
		}
	}

	@Override
	
	public StudentVO getStudent(String num) {
		// TODO 학번으로 학생조회하여 학생정보 return
		
		// 1,2 두개중하나만 있으면 됨.
		// 1번 코드
		int nSize = studentList.size();
		for(int i = 0; i < nSize; i++) {
			// StudentVO vo = null;
			// vo = studentList.get(i); 두개를 하나로 합친 것
			StudentVO vo = studentList.get(i);
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}

		// 2번 코드
		// 새로운 for, forEach
		// (확장된 for, 향상된 for)
		for(StudentVO vo : studentList) {
			if(vo.getNum().equals(num)) return vo;
		}
		
		return null;
	}

	@Override
	public void printStudent() {



		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t주소");
		System.out.println("-".repeat(80));

		// arrayList.size() 할때마다 변동되는 리스트 수를 센다.
		// 그래서 for문 밖에서 한번 다른 변수에 담아서 저장해두면
		// for문 1000번 반복에 각각 1000개를 셀 필요가없다.
		
		/* 
		 *  배열을 사용하여 for() 반복문을 구현할 때는
		 *  배열.length 속성을 직접 반복문의 조건으로 설정한다.
		 *  	i < 배열.length
		 *  
		 *  List 객체는 특성상 수시로 데이터의 개수가 변경된다.
		 *  List에 담긴 개수를 알려주는 size() method는
		 *  호출될때마다 List에 담긴 데이터 개수를 다시
		 *  		헤아리는 코드가 실행된다
		 *  
		 *  for() 반복문 내에서 i <list.size() 코드를 사용하면
		 *  for() 반복문이 반복되는 동안 계속해서 개수를
		 *  		헤어리게 된다.
		 *  데이터의 개수가 몇개 안될때는 큰 문제가 없지만
		 *  데이터 개수가 많아지면 그만큼 성능이 떨어지게 된다.
		 *  
		 *  list 전체를 for() 반복문을 사용하여 순회할때는
		 *  먼저 size() 값을 int 형 변수에 담아놓고 시작하자
		 *  
		 */
		
		int nSize = studentList.size(); 

		for (int i = 0; i < nSize; i++) {
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
