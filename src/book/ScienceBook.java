package book;

import java.util.Scanner;

import exception.WiterFormatException;

public class ScienceBook extends Book  {

	public ScienceBook(BookKind kind) {
		super();
	}

	public void getUserInput(Scanner input) throws WiterFormatException {
		System.out.print("Book Num: ");
		int BookNum = input.nextInt();
		this.setBookNum(BookNum);

		System.out.print("Book Name: ");
		String BookName = input.next();
		this.setBookName(BookName);

		System.out.print("Book Writer: ");
		String BookWriter = input.next();
		this.setBookWriter(BookWriter);

		System.out.print("BookPage: ");
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

		case Science:
			skind = "Science";
			break;

		default:	
		}

		System.out.println("BookNum:"+ BookNum + "BookName:"+ BookName + "BookWriter:"+ BookWriter+ "BookPage:"+ BookPage);
	}

	@Override
	public void setBookWriter(Scanner input) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBookPage(Scanner input) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBookWriter(String bookWriter) throws WiterFormatException {
		// TODO Auto-generated method stub

	}


}
