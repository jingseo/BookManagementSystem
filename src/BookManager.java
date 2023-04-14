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
		System.out.print("Book Num: ");
		book.BookNum = input.nextInt();
		System.out.print("Book Name: ");
		book.BookName = input.next();
		System.out.print("Book Writer: ");
		book.BookWriter = input.next();
		System.out.print("BookPage:");
		book.BookPage = input.nextInt();
		books.add(book);
	}

	public void deleteBook() {
	    System.out.print("BookNum:");
	    int bookNum = input.nextInt();
	    int index = -1;
	    for(int i = 0 ; i<books.size(); i++) {
	    	if (books.get(i).BookNum == bookNum) {
		        index = i;
		        break;
	    	}
	    }
	    if(index >= 0) {
	    	books.remove(index);
	    	System.out.println("the book" + bookNum + "is deleted");
	    }
	     else {
	        System.out.println("The book does not exist");
	        return;
	    }
	}

	public void editBookPage() {
	    System.out.print("BookNum:");
	    int bookNum = input.nextInt();
	    for(int i = 0 ; i<books.size(); i++) {
	    	Book book = books.get(i);
	    	if(book.BookNum == bookNum) {
	    		int num = -1;
	    		while (num !=4) {
	    			System.out.println("1.Book Num");
	    			System.out.println("2.Book Name");
	    			System.out.println("3.Book Writer");
	    			System.out.println("4.Book Page");
	    			System.out.println("Select one number between 1-5: ");
	    			num = input.nextInt();
	    			if(num ==1) {
	    				System.out.print("BookNum: ");
	    				book.BookNum = input.nextInt();
	    			}
	    			else if(num ==2) {
	    				System.out.print("BookName: ");
	    				book.BookName = input.next();
	    			}
	    			else if(num ==3) {
	    				System.out.print("BookWriter:");
	    				book.BookWriter = input.next();
	    			}
	    			else if(num ==4) {
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
//	    System.out.print("BookNum:");
//	    int bookNum = input.nextInt();
	   for(int i =0; i<books.size(); i++) {
		   books.get(i).printInfo();
	    }
	}
}
