package ss;
import java.util.Scanner;
import java.util.ArrayList;
import book.Book;
import book.BookInput;
import book.BookKind;
import exception.WiterFormatException;

import java.io.Serializable;
import java.util.*; 

public class BookManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3043148668538953819L;
	
	ArrayList<BookInput> books = new ArrayList<BookInput>();
	transient Scanner input1;
	Scanner input;
	BookManager(Scanner input){
		this.input1 = input;
	}

	public void addBook() throws WiterFormatException {
		int kind = 0;
		BookInput bookInput;
		while (kind< 1 || kind >3){
			try {
				System.out.println("1 for Essay");
				System.out.println("2 for Novel");
				System.out.println("3 for Science");
				System.out.print("Select num for Book Kind 1 or 2 or 3:");
				kind = input1.nextInt();
				if(kind == 1){
					bookInput = (BookInput) new book.EssayBook (BookKind.Essay);
					bookInput.getUserInput(input1);
					books.add(bookInput);
					break;
				} 
				else if (kind == 2){
					bookInput = (BookInput) new book.NovelBook(BookKind.Novel);
					bookInput.getUserInput(input1);
					books.add(bookInput);
					break;
				}
				else if (kind == 3){
					bookInput = (BookInput) new book.ScienceBook(BookKind.Science);
					bookInput.getUserInput(input1);
					books.add(bookInput);
					break;
				}
				else{
					System.out.print("Select num for Book Kind between 1 and 2 and 3 :");
				}
			}
			catch(InputMismatchException e){

				System.out.println("Please put an integer between 1 and 5!");
				if(input1.hasNext()) {
					input1.next();
				}
				kind = -1;
			}
		}
	}


	private Book NovelBook() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteBook() {
		System.out.print("BookNum:");
		int bookNum = input1.nextInt();
		int index =  findIndex(bookNum);
		removedfromBook(index, bookNum);
	}

	public int findIndex(int bookNum) {
		int index = -1;
		for(int i = 0 ; i<books.size(); i++) {
			if (books.get(i).getBookNum() == bookNum) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removedfromBook(int index, int bookNum) {

		if(index >= 0) {
			books.remove(index);
			System.out.println("the book" + bookNum + "is deleted");
			return 1;
		}
		else {
			System.out.println("The book does not exist");
			return -1;

		}


	}

	public void editBookPage() throws WiterFormatException {
		System.out.print("BookNum:");
		int bookNum = input1.nextInt();
		for(int i = 0 ; i<books.size(); i++) {
			BookInput bookInput = books.get(i);
			if(bookInput.getBookNum() == bookNum) {
				int num = -1;
				while (num !=5) {
					showEditMenu();
					num = input1.nextInt();
					BookInput book = null;
					switch(num) {
					case 1:
						bookInput.setBookNum(input1);
						break;
					case 2:
						bookInput.setBookName(input1);
						break;
					case 3:	
						bookInput.setBookWriter(input1);
						break;
					case 4:
						bookInput.setBookPage(input1);
						break;
					default :
						continue;
					}
				} // while
					break;
			}//if
		}//for
	}

	public int size() {
		return books.size();
	}
	
	public BookInput get(int index) {
		return (Book) books.get(index);
	}

	public void showEditMenu() {

		System.out.println("1.Book Num");
		System.out.println("2.Book Name");
		System.out.println("3.Book Writer");
		System.out.println("4.Book Page");
		System.out.println("Select one number between 1-5: ");

	}

	public void viewBook() {
		//	    System.out.print("BookNum:");
		//	    int bookNum = input.nextInt();
		for(int i =0; i<books.size(); i++) {
			books.get(i).printInfo();
		}
	}

	public void setScanner(Scanner input2) {
		// TODO Auto-generated method stub
		
	}

	public BookInput[] getBookList() {
	    BookInput[] bookList = new BookInput[books.size()];
	    return books.toArray(bookList);
	}
}
