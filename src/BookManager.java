import java.util.Scanner;
public class BookManager {
	Book book;
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook1() {
		book = new Book();
		System.out.print("Book Name: ");
		book.BookName = input.next();
		System.out.print("Book Writer: ");
		book.BookWriter = input.next();
		System.out.print("BookPage:");
		book.BookPage = input.nextInt();
	}

	public void deleteBook() {
	    System.out.print("BookName:");
	    String bookName = input.next();
	    if (book == null) {
	        System.out.print("The book has not been registered");
	        return;
	    }
	    if (book.BookName.equals(bookName)) {
	        book = null;
	        System.out.println("The book is deleted");
	    } else {
	        System.out.println("The book does not exist");
	    }
	}

	public void editBookPage() {
	    System.out.print("BookName:");
	    String bookName = input.next();
	    if (book == null) {
	        System.out.println("The book has not been registered");
	        return;
	    }
	    if (book.BookName.equals(bookName)) {
	        System.out.print("The book to be edited is " + bookName );
	        // add code to edit book page
	    } else {
	        System.out.println("The book does not exist");
	    }
	}

	public void viewBook() {
	    System.out.print("BookName:");
	    String bookName = input.next();
	    if (book == null) {
	        System.out.println("The book has not been registered");
	        return;
	    }
	    if (book.BookName.equals(bookName)) {
	        book.printInfo();
	    } else {
	        System.out.println("The book does not exist");
	    }
	}
}
