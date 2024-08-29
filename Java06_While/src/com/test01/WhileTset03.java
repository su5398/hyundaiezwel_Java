package com.test01;

public class WhileTset03 {

	public static void main(String[] args) {
		//1. 1~100까지의 숫자를 역순으로 출력.
		prn01();
		
		//2. 1~100까지의 숫자 중 2의 배수만 출력
		prn02();
		
		//3. 1~100까지의 숫자 중, 7의 배수의 갯수와 총 합을 출력
		prn03();

	}
	public static void prn01() {
		for(int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}
	public static void prn02() {
		int i = 2;
		while(i<=100){
			System.out.println(i);
			i += 2;
		}
	}
	public static void prn03() {
		int i = 7;
		int num = 0;
		int sum = 0;
		while(i <= 100) {
			System.out.print(i+" ");
			num++;
			sum += i;
			i += 7;
		}
		System.out.println("7의 배수의 갯수는 : "+num+"이고, 총 합은 : "+sum+"이다.");
	}

}
