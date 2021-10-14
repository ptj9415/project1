package co.micol.prject.board.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardVO {
	private int bId;
	private String bWriter;
	private Date bWriteDate;
	private String bTitle;
	private String bContents;
	private int bHit;

	public void toListString() {

		System.out.print(bId + " | \t");
		System.out.print(bWriter + " | \t");
		System.out.print(bWriteDate + " | \t");
		System.out.print(bTitle + " | \t");
		System.out.print(bHit + "\n");
	}
}
