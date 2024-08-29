package com.silsub1.example;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	
	public void printStar1(){
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=0; i<num; i++) {
				for(int j=0; j<i+1; j++) {
					if(i == j) {
						System.out.print(i+1);
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void printStar2(){
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=0; i<num; i++) {
				for(int j=0; j<i+1; j++) {
						System.out.print("*");
				}
				System.out.println();
			}
		}else if(num<0) {
			for(int i=Math.abs(num); i>0; i--) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			System.out.println("출력 기능이 없습니다.");
		}
	}
	
	public void countInputCharacter(){
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			char tmp = str.charAt(i);
			if(!(tmp>='a'&& tmp<='z')||(tmp>='A'&& tmp<='Z')) {
				System.out.println("영문자 아니다.");
				return;//영문자 검증후 아니면 함수 종료
			}
		}
		
		System.out.print("문자 입력 : ");
		char ch= sc.next().charAt(0);
		
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				cnt++;
			}
		}
		System.out.println("포함된 갯수: "+cnt+"개");
		
		/*
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>'a' && str.charAt(i)<'z') {
				if(i==(str.length()-1)) {
					System.out.print("문자 입력 : ");
					String word = sc.next();
					for(int j=0; j<str.length(); j++) {
						if(word.charAt(0)==str.charAt(i)) {
							cnt++;
							if(j==(str.length()-1)){
								System.out.println("포함된 갯수 : "+cnt+"개");
							}
						}
					}	
				}
			}else {
				System.out.println("영문자가 아닙니다.");
			}
		}	
		*/
	}
}
