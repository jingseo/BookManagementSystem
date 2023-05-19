package book;

import java.util.Scanner;

import exception.WiterFormatException;

public abstract class ABook extends Book {
	
	
	public ABook (BookKind kind) {
		super();
	}
	
	@Override
	public  abstract void setBookWriter(Scanner input) ;
	@Override
	public void setBookPage(Scanner input) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printInfo() {
		String skind = getKindString();
	     System.out.println("BookNum:"+ BookNum + "BookName:"+ BookName + "BookWriter:"+ BookWriter+ "BookPage:"+ BookPage);
	}
	
	public void setBookWiterwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y'&& answer != 'Y'&& answer != 'n'&& answer != 'N')
		{
			System.out.print("Do you have an Book Writer? (Y/N)");
			answer  = input.next().charAt(0);
			try {
				if(answer == 'y'|| answer == 'Y') {
					setBookWriter(input);
					break;
			}
			else if(answer == 'n'|| answer == 'N') {
				this.setBookWriter("");
				break;
			}
			else {
			}
			} catch(WiterFormatException e) {
				System.out.println("Incorrect Witer Format. put the Witer that contains @");
				
			}
	  }
	}

}
