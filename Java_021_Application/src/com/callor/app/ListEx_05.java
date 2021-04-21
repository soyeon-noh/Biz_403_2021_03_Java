package com.callor.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx_05 {

	public static void main(String[] args) {
		
		// 인터페이스인 List라고 선언해놓으면 나중에 바꿀때 용이함!!
		// arr하다가 linked하려고 할때 그냥 조금만 바꾸면 됨!!
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> linkArr = new LinkedList<Integer>();
		
		// 무조건 끝에 추가하기
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		view(arr);
		
		// 중간에 위치를 지정하여 추가하기
		linkArr.add(0,100);
		linkArr.add(1,100);
		linkArr.add(2,100);
		linkArr.add(2,100);
		linkArr.add(2,100);
		view(linkArr);
	}
	
	public static List<Integer> view(List<Integer> intList) {
		return intList;
	}
}
