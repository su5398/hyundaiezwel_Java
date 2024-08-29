package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		// static method 실행
		// 클래스.메소드();
		//testWhile();
		//WhileTest01.testWhile2();
		testWhile4();
	}
	
	public static void testWhile() {
		int i = 1;
		while(i<=10) {
			System.out.println(i+"번째 반복문 수행 중...");
			i++;
		}
		System.out.println(i);
	}
	
	public static void testWhile2() {
		//문자열을 입력받아 인덱스별로 문자 출력
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int i = 0;
		while(i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			
			i++;
		}
		
		i = 0;
		while(true) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			
			i++;
			if(i==str.length()) {
				break;
			}
		}
		
	}
	
	public static void testWhile3() {
		//숫자를 하나 입력 받아 1부터 입력받은 수까지 정수들의 합을 구해 출력.
		
		System.out.print("정수 하나 입력: ");
		int num = new Scanner(System.in).nextInt();
		
		int sum=0;
		
		int i = 1;
		while(i<=num) {
			sum += i;
			i++;
		}
		
		System.out.println("sum: " + sum);
	}
	
	public static void testWhile4() {
		//키보드로 4를 입력 받을 때 까지 반복
		//4가 입력되변 종료
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자입력[1~10]: ");
			int no = sc.nextInt();
			
			if(no==4) {
				System.out.println("4입력! 종료!");
				break;
			}
		}
	}

}
