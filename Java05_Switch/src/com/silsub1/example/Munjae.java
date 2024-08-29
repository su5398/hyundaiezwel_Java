package com.silsub1.example;

import java.util.Scanner;

public class Munjae {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요: ");
		int kr = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요: ");
		int en = sc.nextInt();
		System.out.print("수학 점수를 입력해주세요: ");
		int ma = sc.nextInt();
		
		int sum = kr+en+ma;
		double avg = sum/3.0;
		
		if(kr>=40 && en>=40 && ma>=40 && avg>=60) {
			System.out.println("합격입니다. 국어: "+kr+"점, 영어: "+en+"점, 수학: "+ma+"점 입니다.");
			System.out.println("합계는 "+sum+"이고, 평균은 "+avg+"점 입니다.");
		}else {
			System.out.println("불합격");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("***초기 메뉴***\n1.입력\n2.수정\n3.조회\n4.삭제\n7.종료\n메뉴번호 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("다시 입력하십시오");
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("양수다.");
		}else if(num<0) {
			System.out.println("양수가 아니다.");
		}else {
			System.out.println("?");
		}
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		String str = "";
		
		if(num>0) {
			if(num%2 == 0) {
				str = "짝수다";
				System.out.println(str);
			}else {
				str = "홀수다";
				System.out.println(str);
			}
		}
	}
	
	public void inputTest(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요: ");
		String name = sc.nextLine();
		System.out.print("나이을 입력해주세요: ");
		int age = sc.nextInt();
		System.out.print("키를 입력해주세요: ");
		double height = sc.nextDouble();
		
		if(name.length() > 0 && name != null && age>0 && height>0) {
			System.out.println("이름: "+name);
			System.out.println("나이: "+age);
			System.out.println("키: "+height);
			System.out.println("확인: "+name+"의 나이는 "+age+"세이고, 키는 "+height+"cm 이다.");
		}
	}
	
	public void test6(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		
		if(num1>0 && num2>0) {
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			System.out.println(num1+" / "+num2+" = "+(num1/num2));
			System.out.println(num1+" % "+num2+" = "+(num1%num2));
		}
	}
	
	public void test7(){
		Scanner sc = new Scanner(System.in);
		
		String chr = "";
		int score = 0;
		
		System.out.print("점수를 입력해주세요: ");
		score = sc.nextInt();
		
		if(score>0) {
			
			if(score>90) {
				chr = "A";
			}else if(score>80) {
				chr = "B";
			}else if(score>70) {
				chr = "C";
			}else if(score>60) {
				chr = "D";
			}else{
				chr = "F";
			}
			
			System.out.print("점수는 "+score+"점 이고 학점은 "+chr+"입니다.");
		}
	}


}
