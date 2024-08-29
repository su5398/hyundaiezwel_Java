package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;		
			sum +=arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println("합계: "+sum);
	}
	
	public void test2() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("최대값: "+max+" 최소값: "+min);
	}

	public void test3() {
		byte[] arr = new byte[10];
		int sum = 0;
		
		Random random = new Random();
		random.nextBytes(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			if(arr[i]%2==0) {
				sum += arr[i];
			}
		}	
		System.out.println("짝수의 합계: "+sum);	
	}
	
	public void test4(){
		System.out.print("숫자 문자열 입력: ");
		String str = sc.next();
		
		int sum = 0;
		String[] arr = new String[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.substring(i,(i+1));
			sum += Integer.parseInt(arr[i]);
		}
		System.out.print("합계: "+sum);
	}

	public void test5(){
		System.out.print("숫자 문자열 입력: ");
		String str = sc.next();
		
		int sum = 0;
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			System.out.print(arr[i]+" ");
			sum += Character.getNumericValue(arr[i]);
		}
		System.out.print("합계: "+sum);
	}
}
