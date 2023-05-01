package book;

import java.util.Scanner;

public class NovelBook extends Book {
	public void getUserInput(Scanner input) {
		System.out.print("Book Num: ");
		int BookNum = input.nextInt();
		this.setBookNum(BookNum);
		
		System.out.print("Book Name: ");
		String BookName = input.next();
		this.setBookName(BookName);
		
		char answer = 'x';
		while(answer != 'y'&& answer != 'Y'&& answer != 'n'&& answer != 'N')
		{
			System.out.print("Do you have an Book Writer? (Y/N)");
			answer  = input.next().charAt(0);
			if(answer == 'y'|| answer == 'Y') {
				System.out.print("Book Writer:");
				String BookWriter = input.next();
				this.setBookWriter(BookWriter);
				break;
		}
		else if(answer == 'n'|| answer == 'N') {
			this.setBookWriter("");
			break;
		}
		else {
		}
	}
		
		System.out.print("BookPage:");
		int BookPage = input.nextInt();
		this.setBookPage(BookPage);
		}
		}
