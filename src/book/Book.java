package book;

import java.io.Serializable;
import java.util.Scanner;

import exception.WiterFormatException;

public abstract class Book implements BookInput, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8359615610118796787L;

	protected BookKind kind = BookKind.Novel;
	protected int BookNum;
	protected String BookWriter;
	protected String BookName;
	protected int BookPage;

	private String writer;

	public Book() {

	}
	
	public Book(BookKind kind) {
		this.kind = kind;
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

	public BookKind getKind() {
		return getKind();
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
	
	public void setBookWriter(String writer) {
		this.writer = writer;
	}

	public void setBookWriter(Scanner input) {
		String bookWriter = "";
		boolean isValidFormat = false;

		while (!isValidFormat) {
			System.out.print("Book Writer: ");
			bookWriter = input.next();

			if (bookWriter.contains("@")) {
				isValidFormat = true;
			} else {
				System.out.println("Incorrect writer format. Writer name should contain '@'.");
			}
		}

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

	@Override
	public void setBookPage(int bookPage) {
		this.BookPage = bookPage;
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
