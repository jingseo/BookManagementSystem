package book;

import java.util.Scanner;

import exception.WiterFormatException;

public class NovelBook extends ABook {
	
	public NovelBook(BookKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setBookNum(input);
	    setBookName(input);
	    setBookWiterwithYN(input);
		setBookPage(input);
		setBookWriter(input);
		
		}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("BookNum:"+ BookNum + "BookName:"+ BookName + "BookWriter:"+ BookWriter+ "BookPage:"+ BookPage);
	}

	@Override
	public void setBookWriter(Scanner input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBookWriter(String bookWriter) throws WiterFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBookPage(Scanner input) {
		// TODO Auto-generated method stub
		
	}
}
