package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("책이름1","저자1",5000);
		Book b2 = new Book("책이름2","저자2",50000);
		
		System.out.println("b1= "+b1.toString());
		System.out.println("b2= "+b2.toString());
		
		System.out.println("b1과 b2는 같은 객체?: "+b1.equals(b2));
		
		//얕은복사
		Book b3 = b1;
		System.out.println("b1과 얕은 복사된 b3는 같은 객체?: "+b1.equals(b3));
		
		//깊은 복사
		Book b4 = new Book(b1.getTitle(),b1.getAuthor(),b1.getPrice());
		System.out.println("b1과 깊은 복사된 b4는 같은 객체?: "+b1.equals(b4));
		System.out.println("b1: "+b1.hashCode());
		System.out.println("b3: "+b3.hashCode());
		System.out.println("b4: "+b4.hashCode());
		
	}

}
