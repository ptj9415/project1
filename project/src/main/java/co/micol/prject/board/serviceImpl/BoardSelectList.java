package co.micol.prject.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prject.board.service.BoardService;
import co.micol.prject.board.service.BoardVO;
import co.micol.prject.comm.Command;

public class BoardSelectList implements Command {
	
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = dao.boardSelectList();
		System.out.println("=============================================");
		for(BoardVO vo : boards) {
			vo.toListString();
		}
		System.out.println("=============================================");
	}
}
