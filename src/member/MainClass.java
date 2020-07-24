package member;

import java.util.ArrayList;
import java.util.Scanner;

import dao.MemberDao;
import dao.MemberDaoImpl;
import dto.MemberDto;
import util.MyUtil;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("회원 가입");
		
		// 데이터
		MemberDto dto = new MemberDto();
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("패스워드: ");
		String pw = sc.next();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("전화번호: ");
		String tel = sc.next();
		
		// 전화번호 하이픈 기능 사용
		String myTel = MyUtil.makePhoneNumber(tel);
		System.out.println(myTel);
		if (myTel == null) {
			// 다시입력
		}
		
		dto.setEmail(email);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		
		// 이메일을 가지고 ID를 셋팅
		String [] emailArr = email.split("@");
		System.out.println(emailArr.length);
		try {
			String a = emailArr[1];
		} catch (Exception e) {
			// 다시 입력
		}
		if (emailArr.length < 1) {
//		if (emailArr[1] < 1) {
			// 다시입력
		}
		dto.setId(emailArr[0]);

		
		
		
		
		// 데이터 처리
		MemberDao dao = new MemberDaoImpl();
		dao.insert(dto);
	}

}
