package com.inherit.par01_inheritTest.after;

import java.util.Date;

public class Television extends Product {
	//Product클래스를 상속받아 구현
	//이때 Product의 멤버(필드, 메소드) 자신의 것처험 사용 가능하다.
	private int inch;
	
	public Television() {
		super();
	}

	//부모의 필드 초기화 위해 부모의 필드값까지 매개변수로 받는다.
	public Television(String brand, String productNumber, String productCode, String productName, int price,
			Date date, int inch) {
		//부모클래스의 생성자 호출 값 전달.
		super(brand, productNumber, productCode, productName, price, null);
		//부모 생성자에서 필요하지 않은 값은 자식 클래스 필드 초기화에 사용.
		this.inch = inch;
		
		System.out.println("product를 상속받은 television 클래스 생성자 호출 완료...");
	}
	//getter&setter 부모의 것을 자신처럼 사용가능. 작성 필요x

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String printinfo() {
		//부모의 필드가 private인 경우 자식 클래스에서 직접 접근 불가능
		//return super.brand;
		
		//사용가능한 메소드를 통해 부모 필드값 확인 가능.
		//return super.getBrand()+", "+super.getProductNumber();
	
		//부모의 필드 출력용 메소드 사용
		return super.printInfo()+", "+this.inch;
	}
	
}
