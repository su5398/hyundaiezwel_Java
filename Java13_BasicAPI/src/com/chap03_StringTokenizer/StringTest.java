package com.chap03_StringTokenizer;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		String str = "권장현,28,경기도 수원시 영통구,남";
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String arr[] = str.split(",");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//StringTokenizer
	//split()과 차이는 split은 String클래스의 메소드, 추출한 문자를 배열로 저장
	//StringTokenizer는 클래스
	
	//countToken(), nextToken(), hasMoreTokens()...

}
