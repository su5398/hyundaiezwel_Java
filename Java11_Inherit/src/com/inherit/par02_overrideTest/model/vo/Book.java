package com.inherit.par02_overrideTest.model.vo;

public class Book {
	//모든 클래스는 Object 클래스의 후손
	private String title;
	private String writer;
	private int price;
	
	public Book() {}

	public Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//Object 클래스의 메서드 toString을 override하여 재정의
	@Override
	public String toString() {
		return title+", "+writer+", "+price;
	}
	
	//두 객체의 주소값 비교 ==> 객체가 가진 값 비교
	@Override
	public boolean equals(Object obj) {
	
		//객체의 주소가 같으면 같은 객체
		if(this==obj) {
			return true;
		}
		
		//전달 받은 객체가 null이면 무조건 다른 객체다.
		if(obj==null) {
			return false;
		}
		
		//전달 받은 객체가 Object 타입의 변수에 담겨 있으므로
		//Book 타입으로 형변환 필요
		Book other = (Book)obj;
		
		//title
		if(title == null) { //원본 객체의 제목이 null이면 비교할 객체 제목도 null이어야 한다.
			if(other.title != null) {//그렇지 않으면 false리턴
				return false;
				}
		}else if(!title.equals(other.title)) {
				//두 객체의 title이 String의 equals로 비교하여 다른 경우에도 false리턴
			return false;
		}
			
		//writer도 title과 동일한 방식으로 처리
		if(writer == null) {
			if(other.writer != null) {
				return false;
			}
		}else if(!writer.equals(other.writer)) {
			return false;
		}
			
		//price
		//기본자료향의 경우 값만 일치하는지 비교
		if(price != other.price) {
			return false;
		}
		
		//위의 모든 조건을 통과한다. =>  필드값들이 다 값다. => 같은 객체로 판단하자.
		return true;
		
	}
	
	@Override
	public int hashCode() {
		return (title+writer+price).hashCode();
	}
}
