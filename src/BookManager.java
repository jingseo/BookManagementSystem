import java.util.Scanner;
import java.util.*; 

import book.Book;
import book.BookInput;
import book.BookKind;

import java.util.ArrayList;

public class BookManager {
	ArrayList<BookInput> books = new ArrayList<BookInput>();
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook() {
		int kind = 0;
        BookInput bookInput;
		while (kind != 1 && kind != 2){
		System.out.print("1 for Essay");
		System.out.print("2 for Novel");
		System.out.print("3 for Science");
		System.out.print("Select num for Book Kind 1 or 2 or 3:");
		kind = input.nextInt();
		if(kind == 1){
			bookInput = (BookInput) new book.EssayBook(null);
			bookInput.getUserInput(input);
			books.add(bookInput);
			break;
		} 
		else if (kind == 2){
			bookInput = (BookInput) new book.NovelBook(null);
			bookInput.getUserInput(input);
			books.add(bookInput);
			break;
		}
		else if (kind == 3){
			bookInput = (BookInput) new book.ScienceBook(null);
			bookInput.getUserInput(input);
			books.add(bookInput);
			break;
		}
		else{
		System.out.print("Select num for Student Kind between 1 and 2 and 3 :");
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
	    	BookInput bookInput = books.get(i);
	    	if(bookInput.getBookNum() == bookNum) {
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
	    				bookInput.setBookNum(BookNum);
	    			}
	    			else if(num ==2) {
	    				System.out.print("BookName: ");
	    				String BookName = input.next();
	    				bookInput.setBookName(BookName);
	    			}
	    			else if(num ==3) {
	    				System.out.print("BookWriter:");
	    				String BookWriter = input.next();
	    				bookInput.setBookWriter(BookWriter);
	    			}
	    			else if(num ==4) {
	    				System.out.print("BookPage:");
	    				int BookPage = input.nextInt();
	    				bookInput.setBookPage(BookPage);
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
