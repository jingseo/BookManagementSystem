	package book;

import java.util.Scanner;

import exception.WiterFormatException;

public abstract class ABook extends Book {
	
	public ABook(BookKind kind) {
		super();
	}
	
	@Override
	public void setBookWriter(Scanner input) throws WiterFormatException {
	    System.out.print("Book Writer: ");
	    String bookWriter = input.next();
	    this.setBookWriter(bookWriter);
	}
	
	@Override
	public void setBookPage(Scanner input) {
		// TODO Auto-generated method stub
		 System.out.print("Book Page: ");
		    int bookPage = input.nextInt();
		    this.setBookPage(bookPage);
		
	}
	
	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("BookNum:" + BookNum + "BookName:" + BookName + "BookWriter:" + BookWriter + "BookPage:" + BookPage);
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
