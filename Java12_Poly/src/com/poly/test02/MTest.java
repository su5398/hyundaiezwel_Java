package com.poly.test02;

import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {
		System.out.print("선택 [1.고양이 2.송아지 3.강아지] : ");
		int sel = new Scanner(System.in).nextInt();
		
		//다형성 적용
		Base base = null;
		
		switch(sel) {
		case 1:
			base = new Cat();
			break;
		case 2:
			base = new Cow();
			break;
		case 3:
			base = new Dog();
			break; 
		}
		
		base.start();
		base.stop();
		
//		Cat c=(Cat)base;
//		c.test();
		
		((Cat)base).test();
	}
}
