package com.test01;

public class DeArrayTest02 {
	public void test1() {
		//구구단을 2차원 배열에 넣어보자
		int[][] arr = new int[8][9];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (i+2)*(j+1);
			}
		}
		
		new DeArrayTest01().printArray(arr);
	}
	
	public void test2() {
		//5x5 2차원 배열 생성
		int[][] arr = new int[5][5];
		int value = 1;
		//생성한 2차원 배열에 값을 대입.
		/*
		1 5 10
		2 6 11
		3 7 12
		4 8 13
		5 9 14 ... 25
		 */
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[j][i] = value++;
			}
		}
		//2차원 배열에 값을 대입 완료하면 출력하여 결과 확인
		new DeArrayTest01().printArray(arr);
	}
}
