package silsub1.run;

import silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member m =new Member();
		
		m.setMemberId("Id");
		System.out.println(m.getMemberId());
		
		m.setMemberPwd("1234");
		System.out.println(m.getMemberPwd());
		
		m.setMemberName("권장현");
		System.out.println(m.getMemberName());
		
		m.setAge(28);
		System.out.println(m.getAge());
		
		m.setGender('M');
		System.out.println(m.getGender());
		
		m.setPhone("010-5209-5398");
		System.out.println(m.getPhone());
		
		m.setEmail("su539@naver.com");
		System.out.println(m.getEmail());
	}

}
