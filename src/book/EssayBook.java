package book;

import java.util.Scanner;
import exception.WiterFormatException;

public class EssayBook extends ABook {
	
	 private String essayTopic;

	    public EssayBook(int BookNum, String BookName, String BookWriter, int BookPage, String essayTopic) {
	        super(BookNum, BookName, BookWriter, BookPage);
	        this.essayTopic = essayTopic;
	    }
	
	public EssayBook(BookKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setBookNum(input);
	    setBookName(input);
		setBookPage(input);
		setBookWriter(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("BookNum:"+ BookNum + "BookName:"+ BookName + "BookWriter:"+ BookWriter+ "BookPage:"+ BookPage);
	}

	@Override
	public void setBookWriter(String bookWriter) throws WiterFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBookPage(Scanner input) {
	    System.out.print("BookPage: ");
	    int bookPage = input.nextInt();
	    this.setBookPage(bookPage);
	}
}
