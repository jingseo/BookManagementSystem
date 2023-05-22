package book;

import java.util.Scanner;
import exception.WiterFormatException;


public abstract class ABook extends Book {

	public ABook(BookKind kind) {
		super();
	}

	public ABook(int bookNum, String bookName, String bookWriter, int bookPage) {
		super(bookNum, bookName, bookWriter, bookPage);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("BookNum:" + BookNum + "BookName:" + BookName + "BookWriter:" + BookWriter + "BookPage:" + BookPage);
	}

	public void setBookPage(int bookPage) {
		this.BookPage = bookPage;
	}

	public void setBookWiterwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a Book Writer? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setBookWriter(input);
					break;
				} else if (answer == 'n' || answer == 'N') {
					this.setBookWriter("");
					break;
				} else {
					throw new IllegalArgumentException("Invalid input. Please enter 'Y' or 'N'.");
				}
			} catch (WiterFormatException e) {
				System.out.println("Incorrect Writer Format. Put the Writer that contains '@'");
			}
		}
	}
}