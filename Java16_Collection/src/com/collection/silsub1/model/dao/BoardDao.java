package com.collection.silsub1.model.dao;

import java.util.ArrayList;

import com.collection.silsub1.model.dto.BoardDto;

//DAO(Data Access Object) : 데이터(DB) 접근하는 객체
public class BoardDao {
	private ArrayList<BoardDto> list = new ArrayList<BoardDto>();

	public int getLastNo() {
		//list 마지막에 저장되어 있는 게시글의 게시글 번호를 리턴
		int lastNo = 0;
		if(list.size()>0) {
			lastNo = list.get(list.size()-1).getNo();
		}else {
			lastNo = 0;
		}
		
		return lastNo;
	}
	
	//[1]글작성
	public void writeBoard(BoardDto board) {
		list.add(board);
	}
	//[2]글 전체 확인(저장된 게시글 전부 불러오기)
	public ArrayList<BoardDto> displayAllList(){
		return list;
	}
	//[2]글 한개 확인(저장된 게시글 중 원하는 게시글 하나 불러오기)
	public BoardDto displayBoard(int no) {
		BoardDto dto = null;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNo() == no) {
				dto = list.get(i);
				break;
			}
		}
		return dto;
	}
	//[3]글 제목 수정
	public void updateTitle(int no, String title) {
		
	}
	//[3]글 내용 수정
	public void updateContent(int no, String content) {
		
	}
	//[4]글 삭제
	public void deleteBoard(int no) {
		
	}
	//[5]글 검색
	public ArrayList<BoardDto> searchBoard(String title){
		return null;
	}
	
}
