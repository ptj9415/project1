package co.micol.prject.member.serviceImpl;

import java.util.Scanner;

import co.micol.prject.comm.Command;
import co.micol.prject.member.service.MemberSerVice;
import co.micol.prject.member.service.MemberVO;

public class MemberList implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		MemberSerVice dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println();
		System.out.println("회원 검색 메뉴입니다.");
		System.out.println("검색할 회원의 id를 입력해주세요.");
		vo.setId(sc.nextLine());
		vo = dao.memberSelect(vo);
		System.out.println("======================");
		vo.toString();
		System.out.println("======================");
	}
}
