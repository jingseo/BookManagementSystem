package book;

import java.util.Scanner;

public class EssayBook extends Book implements BookInput {
	
	public EssayBook(BookKind kind) {
		super();
	}
	
	public EssayBook(Object kind) {
		// TODO Auto-generated constructor stub
	}

	public void EssayBook1(Object kind) {
		// TODO Auto-generated constructor stub
	}

	public void getUserInput(Scanner input) {
		System.out.print("Book Num: ");
		int BookNum = input.nextInt();
		this.setBookNum(BookNum);
		
		System.out.print("Book Name: ");
		String BookName = input.next();
		this.setBookName(BookName);
		
		System.out.print("Book Writer: ");
		String BookWriter = input.next();
		this.setBookWriter(BookWriter);
		
		System.out.print("BookPage:");
		int BookPage = input.nextInt();
		this.setBookPage(BookPage);
	}

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Essay:
			skind = " Essay";
			break;
		case Novel:
			skind = "Novel";
			break;
		default:	
		}
		
		System.out.println("BookNum:"+ BookNum + "BookName:"+ BookName + "BookWriter:"+ BookWriter+ "BookPage:"+ BookPage);
	}

}