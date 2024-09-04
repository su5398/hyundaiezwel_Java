package com.collection.silsub1.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.collection.silsub1.controller.BoardController;
import com.collection.silsub1.model.dto.BoardDto;

//View : 화면. 데이터를 보여주거나 입력 받는 역할
public class BoardMenu {
	private BoardController bc = new BoardController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			System.out.println("*****게시글 프로그램******");
			System.out.println("1. 게시글 쓰기");
			System.out.println("2. 게시글 전체 보기");
			System.out.println("3. 게시글 한개 보기");
			System.out.println("4. 게시글 제목 수정");
			System.out.println("5. 게시글 내용 수정");
			System.out.println("6. 게시글 삭제");
			System.out.println("7. 게시글 검색");
			System.out.println("0. 끝내기");
			
			System.out.print("메뉴 번호 선택: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: writeBoard();break;
			case 2: displayAll();break;
			case 3:	displayBoard();break;
			case 4:
			case 5:
			case 6:
			case 7:
			case 0: System.out.println("프로그램 종료!");return;
			}
		}
	}
	
	///////////////////
	public void writeBoard() {
		System.out.println("새 게시글 쓰기");
		System.out.print("글제목: ");
		String title = sc.nextLine();
		System.out.print("작성자: ");
		String writer = sc.nextLine();
		
		System.out.print("내용: ");
		String content = sc.nextLine();
		
		BoardDto dto = 
				new BoardDto(0, title, writer, content, new Date());
	
		bc.writeBoard(dto);
	}
	
	public void displayAll() {
		ArrayList<BoardDto> list = bc.displayAllList();
		for(BoardDto dto:list) {
			System.out.println(dto);
		}
		
	}
	
	public void displayBoard() {
		System.out.print("조회할 번호: ");
		int no = sc.nextInt();
		
		BoardDto board = bc.displayBoard(no);
		if(board == null) {
			System.out.println("조회한 글이 없습니다.");
		}else {
			System.out.println(board);
		}
		
	}
	
	
}
