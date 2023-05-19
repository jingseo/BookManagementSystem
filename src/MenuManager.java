import java.util.InputMismatchException;
import java.util.Scanner;

import exception.WiterFormatException;

public class MenuManager {
	public static void main(String[] args) throws WiterFormatException {
		Scanner input = new Scanner(System.in);
		BookManager bookManager = new BookManager(input);
		selectMenu(input, bookManager);
	}

	
	public static void selectMenu(Scanner input, BookManager bookManager) throws WiterFormatException {
		
		int num = -1;
		while (num !=5) {
			try {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				bookManager.addBook();
				break;
			case 2:
				bookManager.editBookPage();
				break;
			case 3:
				bookManager.deleteBook();
				break;
			case 4:
				bookManager.viewBook();
				break;
			default:
				 continue;
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}

		}
	}
	
	public static void showMenu() {
		
		System.out.println("1.Add Book");
		System.out.println("2.Edit Book page");
		System.out.println("3.Delete Book");
		System.out.println("4.View Books");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5: ");
		
	}
}




	