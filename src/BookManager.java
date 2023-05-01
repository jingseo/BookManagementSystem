import java.util.Scanner;
import java.util.*; 

import book.Book;

import java.util.ArrayList;

public class BookManager {
	ArrayList<Book> books = new ArrayList<Book>();
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook() {
		int kind = 0;
        Book book;
		while (kind != 1 && kind != 2){
		System.out.print("1 for Essay");
		System.out.print("2 for Novel");
		System.out.print("Select num for Book Kind between 1 and 2:");
		kind = input.nextInt();
		if(kind == 1){
			book = new Book();
			book.getUserInput(input);
			books.add(book);
			break;
		} 
		else if (kind == 2){
			book = new book.NovelBook();
			book.getUserInput(input);
			books.add(book);
			break;
		}
		else{
		System.out.print("Select num for Student Kind between 1 and 2:");
			}
		}
	}

	private Book NovelBook() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteBook() {
	    System.out.print("BookNum:");
	    int bookNum = input.nextInt();
	    int index = -1;
	    for(int i = 0 ; i<books.size(); i++) {
	    	if (books.get(i).getBookNum() == bookNum) {
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
	    	if(book.getBookNum() == bookNum) {
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
	    				int BookNum = input.nextInt();
	    				book.setBookNum(BookNum);
	    			}
	    			else if(num ==2) {
	    				System.out.print("BookName: ");
	    				String BookName = input.next();
	    				book.setBookName(BookName);
	    			}
	    			else if(num ==3) {
	    				System.out.print("BookWriter:");
	    				String BookWriter = input.next();
	    				book.setBookWriter(BookWriter);
	    			}
	    			else if(num ==4) {
	    				System.out.print("BookPage:");
	    				int BookPage = input.nextInt();
	    				book.setBookPage(BookPage);
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
