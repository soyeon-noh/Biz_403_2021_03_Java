package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

public class Class_01 {
// 1. 큰 크기의 배열을 생성한 후 약수 갯수만큼 배열크키 조정 
//		=> 내가 사용한방법
//		=> 배열을 두번 생성함
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int j = 0;
		int intNum = 0; // 난수 발생
		intNum = random.nextInt(51) + 50; 
		int[] divisor = new int[intNum]; // 약수배열 생성
	
		for(int i = 2; i < intNum; i++) { // 약수 삽입
			if( intNum % i == 0) {
				divisor[j] = i; // 이거 랑 아랫줄 합칠수있음 그냥 여기에 j++
				j++;
			}
		}
		
		int[] divisorArr = new int[j]; // 배열크기 조정
		
		for(int i = 0; i < j; i++) {
			divisorArr[i] = divisor[i];
		}
		
		System.out.printf("난수 %d 의 약수\n", intNum);
		System.out.println(Arrays.toString(divisorArr));
	}
}
// 2. 약수 갯수를 먼저 센 후에 배열크기를 선언하는 방법.
//		=> 배열을 한번만 생성하므로 효율적

//		for(int i = 2; i < intNum; i++) {
//			if(intNum % i == 0) {
//				j++;
//			}
//		}
//
//		int[] divisor = new int[j];
//	
//		for(int i = 2; i < j; i++) {
//			if(intNum % i == 0) {
//				divisor[i] = i;
//			}
//		}









