package book;

import java.util.Scanner;

import exception.WiterFormatException;

public abstract class Book implements BookInput {

	protected int BookNum;
	protected String BookWriter;
	protected String BookName;
	protected int BookPage;
	
	public Book() {
		
	}
	
	public Book(int BookNum, String BookName ) {
		this.BookNum = BookNum;
		this.BookName = BookName;
		
    }
	
	public Book(int BookNum, String BookName, String BookWriter) {
		this.BookNum = BookNum;
		this.BookName = BookName;
		this.BookWriter = BookWriter;
	}
	
	public Book(int BookNum, String BookName, String BookWriter, int BookPage) {
		this.BookNum = BookNum;
		this.BookName = BookName;
		this.BookWriter = BookWriter;
		this.BookPage = BookPage;
	}
	
	protected BookKind kind = BookKind.Novel;
	public BookKind getKind() {
		return kind;
	}

	public void setKind(BookKind kind) {
		this.kind = kind;
	}

	public int getBookNum() {
		return BookNum;
	}

	public void setBookNum(int bookNum) {
		BookNum = bookNum;
	}

	public String getBookWriter() {
		return BookWriter;
	}

	public void setBookWriter(String bookWriter) throws WiterFormatException {
		if (!bookWriter.contains ("@") || !bookWriter.equals("")) {
			throw new WiterFormatException();
		}
		this.BookWriter = bookWriter;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public int getBookPage() {
		return BookPage;
	}

	public void setBookPage(int bookPage) {
		BookPage = bookPage;
	}

	
	public abstract void printInfo();
	
	public void setBookNum(Scanner input) {
		System.out.print("BookNum: ");
		int BookNum = input.nextInt();
		this.setBookNum(BookNum);	
	}
	
	public void setBookName(Scanner input) {
		System.out.print("BookName: ");
		String BookName = input.next();
		this.setBookName(BookName);
	}
	
	public void setBookWriter(Scanner input) {
		String BookWiter = "";
		while(! BookWiter.contains("@")) {
		System.out.print("Book Writer: ");
		BookWriter = input.next();
		try {
		this.setBookWriter(BookWriter);
		} catch(WiterFormatException e) {
			System.out.println("Incorrect Witer Format. put the Witer that contains @");
		}
		}
	}
	
	
	public String getKindString() {
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
		return skind;
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
		
		System.out.print("BookPage:");
		int BookPage = input.nextInt();
		this.setBookPage(BookPage);
	}

}
