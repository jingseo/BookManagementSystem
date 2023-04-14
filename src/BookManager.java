import java.util.Scanner;
import java.util.ArrayList;

public class BookManager {
	ArrayList<Book> books = new ArrayList<Book>();
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook1() {
		Book book = new Book();
		System.out.print("Book Name: ");
		book.BookName = input.next();
		System.out.print("Book Writer: ");
		book.BookWriter = input.next();
		System.out.print("BookPage:");
		book.BookPage = input.nextInt();
		books.add(book);
	}

	public void deleteBook() {
	    System.out.print("BookName:");
	    String bookName = input.next();
	    int index = -1;
	    for(int i = 0 ; i<books.size(); i++) {
	    	if (books.get(i).BookName == bookName) {
		        index = i;
		        break;
	    	}
	    }
	    if(index >= 0) {
	    	books.remove(index);
	    	System.out.println("the book" + bookName + "is deleted");
	    }
	     else {
	        System.out.println("The book does not exist");
	        return;
	    }
	}

	public void editBookPage() {
	    System.out.print("BookName:");
	    String bookName = input.next();
	    for(int i = 0 ; i<books.size(); i++) {
	    	Book book = books.get(i);
	    	if(book.BookName == bookName) {
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
	    				System.out.print("Book Name: ");
	    				book.BookName = input.next();
	    			}
	    			else if(num ==2) {
	    				System.out.print("Book Writer: ");
	    				book.BookWriter = input.next();
	    			}
	    			else if(num ==3) {
	    				System.out.print("BookPage:");
	    				book.BookPage = input.nextInt();
	    			}
	    			else {
	    			continue;
	    			} //if
	    	} // while
	    		break;
	    	}//if
	    }//for
	}
	    	

	public void viewBook() {
//	    System.out.print("BookName:");
//	    String bookName = input.next();
	   for(int i =0; i<books.size(); i++) {
		   books.get(i).printInfo();
	    }
	}
}
