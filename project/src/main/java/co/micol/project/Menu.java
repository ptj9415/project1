package co.micol.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.micol.prject.board.serviceImpl.BoardSelectList;
import co.micol.prject.comm.Command;
import co.micol.prject.member.serviceImpl.MemberList;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();

	public Menu() {
		map.put("BoardSelectList", new BoardSelectList());
		map.put("MemberList", new MemberList());
	}

	private void mainMenu() {
		System.out.println("=========메뉴=========");
		System.out.println("1. 공지사항 조회      ");
		System.out.println("2. 회원 검색          ");
		System.out.println("3. 종료               ");
		System.out.println("======================");
		System.out.print("원하는 작업 번호를 선택하세요 >> ");
	}

	private void menu() {
		while (true) {
			mainMenu();
			int n = sc.nextInt();
			if (n == 1) {
				executeRun("BoardSelectList");

			} else if (n == 2) {
				executeRun("MemberList");
			} else if (n == 3) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}

	private void executeRun(String string) {
		Command command = map.get(string);
		command.execute();
	}

	public void run() {
		menu();
	}
}
