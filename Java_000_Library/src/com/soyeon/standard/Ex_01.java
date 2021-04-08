package com.soyeon.standard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.soyeon.standard.impl.InputServiceImplV1;
import com.soyeon.standard.impl.InputServiceImplV2;

public class Ex_01 {

	public static void main(String[] args) {
		InputServiceImplV2 isV2
			= new InputServiceImplV2();
		InputService isV1
			= new InputServiceImplV1();
		//인터페이스로 선언하고 생성할때는 구체적클래스에서 
		
		isV1.inputValue("새우깡");
		isV1.inputVlaue("새우깡", 0);
		isV1.inputVlaue("새우깡", 0, 1000);
		
		/*
		 * List 인터페이스를 구현한 클래스는
		 * ArrayList, LinkedList, Vector 등 3가지가 있다.
		 * 3가지의 클래스는 코드에 List 인터페이스를 impl 했을 것이다
		 * 이러한 클래스는 선언과 생성을 할 때
		 * 인터페이스로 선언하고,
		 * 		클래스의 생성자로 객체를 생성하는 것이 좋다.
		 */
		/* 
		 * List 인터페이스를 impl한 클래스들은
		 * List type 의 클래스다 라고 호칭한다.
		 */
		List<Integer> intList = new ArrayList<Integer>();
		intList = new LinkedList<>();
		intList = new Vector<Integer>();
		
		// 이렇게 해도 되는데 왜 인터페이스를 쓰냐!
		// 인터페이스를 쓰는 것의 장점이 더 많다.
		ArrayList<String> strList = new ArrayList<String>();
	}
}
