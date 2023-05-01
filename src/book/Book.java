package book;

import java.util.Scanner;

public class Book {

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

	public void setBookWriter(String bookWriter) {
		BookWriter = bookWriter;
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

	
	public void printInfo() {
		System.out.println("BookNum:"+ BookNum + "BookName:"+ BookName + "BookWriter:"+ BookWriter+ "BookPage:"+ BookPage);
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

}
