package com.uni;

public class StudentTest {

	public static void main(String[] args) {
		Student arrays[] = new Student[3];
		
		Student s1 = new Student("홍길동",15,171,81,"201101","영문");
		arrays[0] = s1;
		Student s2 = new Student("한사람",13,183,72,"201102","건축");
		arrays[1] = s2;
		Student s3 = new Student("임걱정",16,175,65,"201103","무영");
		arrays[2] = s3;
		
		for(int i=0; i<arrays.length; i++) {
			System.out.println(arrays[i].printInformation());
		}
	}

}
