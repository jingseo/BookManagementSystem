package book;

import java.util.Scanner;

import exception.WiterFormatException;

public class EssayBook extends ABook {
	
	public EssayBook(BookKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setBookNum(input);
	    setBookName(input);
	    setBookWiterwithYN(input);
		setBookPage(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("BookNum:"+ BookNum + "BookName:"+ BookName + "BookWriter:"+ BookWriter+ "BookPage:"+ BookPage);
	}
	
	@Override
	public void setBookWriter(Scanner input) {
	    System.out.print("Book Writer: ");
	    String bookWriter = input.next();
	    super.getBookWriter();
	}

	@Override
	public void setBookPage(Scanner input) {
		// TODO Auto-generated method stub
		    System.out.print("Book Page: ");
		    int bookPage = input.nextInt();
		    this.setBookPage(bookPage);
	}

	@Override
	public void setBookWriter(String bookWriter) throws WiterFormatException {
		// TODO Auto-generated method stub
		
	}

}
