package com.silsub1.model;

import java.util.Scanner;

public class Sample {

	public void munjae1() {
		int[][] arr = new int[4][4];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]=(int)((Math.random()*100)+1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j]*2;
			}
		}
			
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
	
	public void munjae2() {
		int sum = 0;
		int arr[][] = new int[3][];
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 행의 열: ");
		int num1 = sc.nextInt();
		arr[0] = new int[num1];
		System.out.print("두번째 행의 열: ");
		int num2 = sc.nextInt();
		arr[1] = new int[num2];
		System.out.print("세번째 행의 열: ");
		int num3 = sc.nextInt();
		arr[2] = new int[num3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)((Math.random()*100)+1);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
			if(sum%5==0) {
				for(int a=0; a<arr[i].length; a++) {
					System.out.print(arr[i][a]+" ");
				}
				System.out.println();
			}
			sum = 0;
		}
		
	}
}
