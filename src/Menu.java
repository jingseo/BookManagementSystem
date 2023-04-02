import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	int num = 0;
	Scanner input = new Scanner(System.in);
	
	while (num !=4) {
		System.out.println("1.Add Book");
		System.out.println("2.Edit Book page");
		System.out.println("3.Delete Book");
		System.out.println("4.Exit");
		System.out.println("Select one number between 1-4: ");
		num = input.nextInt();
		if(num ==1) {
			addBook1();
		}
		else if(num ==2) {
			editBookPage();
		}
		else if(num ==3) {
			deleteBook();
		}
		else {
			continue;
		}
	}
	}


public static void addBook1() {
	Scanner input = new Scanner(System.in);
	System.out.print("Book Name: ");
	String BookName = input.next();
	System.out.println(BookName);
	System.out.print("Book Writer: ");
	String BookWriter = input.next();
	System.out.println(BookWriter);
}

public static void editBookPage() {
	Scanner input = new Scanner(System.in);
	System.out.print("Book Page: ");
	int BookPage = input.nextInt();
	
}
public static void deleteBook() {
	Scanner input = new Scanner(System.in);
	System.out.print("Book Name: ");
	String BookName = input.next();	
}


}




	