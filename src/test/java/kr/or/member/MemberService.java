package kr.or.member;

import kr.or.member.MemberVO;

public class MemberService {
	//Action - Service클래스 = 출력용 메서드 작성
		//매개변수로 클래스 배열을 받아서 출력하는 형태로 작성
		public void printMembers(MemberVO[] members) {
			//향상된 for문(loop문) 사용(형태 = 단일값: 전체값)
			for(MemberVO m : members) {
				System.out.println("-------------");
				System.out.println(m.getName());
				System.out.println(m.getAge() + "세");
				System.out.println(m.getPhoneNum());
			}
		}
}