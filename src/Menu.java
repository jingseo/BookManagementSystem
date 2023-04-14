import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookManager = new BookManager(input);
		
	int num = -1;
	while (num !=5) {
		System.out.println("1.Add Book");
		System.out.println("2.Edit Book page");
		System.out.println("3.Delete Book");
		System.out.println("4.View Books");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5: ");
		num = input.nextInt();
		if(num ==1) {
			bookManager.addBook1();
		}
		else if(num ==2) {
			bookManager.editBookPage();
		}
		else if(num ==3) {
			bookManager.deleteBook();
		}
		else if(num ==4) {
			bookManager.viewBook();
		}
		else {
			continue;
		}
	}
	}
}




	