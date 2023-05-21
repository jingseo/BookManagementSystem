import java.util.Scanner;

import java.util.*; 

import book.Book;
import book.BookInput;
import book.BookKind;
import exception.WiterFormatException;

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
		while (kind< 1 || kind >3){
			try {
		System.out.println("1 for Essay");
		System.out.println("2 for Novel");
		System.out.println("3 for Science");
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
			catch(InputMismatchException e){
				
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			} catch (WiterFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
	    int bookNum = input.nextInt();
	    for(int i = 0 ; i<books.size(); i++) {
	    	BookInput bookInput = books.get(i);
	    	if(bookInput.getBookNum() == bookNum) {
	    		int num = -1;
	    		while (num !=4) {
	    			showEditMenu();
	    			num = input.nextInt();
	    			BookInput book = null;
					switch(num) {
	    			case 1:
	    				setBookNum(book, input);
	    				break;
	    			case 2:
	    				 setBookName(book, input);
	    				 break;
	    			case 3:	
	    				setBookWriter(book, input);
	    				break;
	    		    case 4:
	    		    	setBookPage(book, input);
	    		    	break;
	    		    default :
	    		    	continue;
	    			}
	    	} // while
	    		break;
	    	}//if
	    }//for
	}
	
	public void showEditMenu() {
		
		System.out.println("1.Book Num");
		System.out.println("2.Book Name");
		System.out.println("3.Book Writer");
		System.out.println("4.Book Page");
		System.out.println("Select one number between 1-5: ");
		
	}
	
	public void setBookNum(BookInput book , Scanner input) {
		System.out.print("BookNum: ");
		int BookNum = input.nextInt();
		book.setBookNum(BookNum);	
	}
	
	public void setBookName(BookInput book , Scanner input) {
		System.out.print("BookName: ");
		String BookName = input.next();
		book.setBookName(BookName);
	}
	
	public void setBookWriter(BookInput book , Scanner input) throws WiterFormatException {
		System.out.print("BookWriter:");
		String BookWriter = input.next();
		book.setBookWriter(BookWriter);
	}
	
	public void setBookPage(BookInput book , Scanner input) {
		System.out.print("BookPage:");
		int BookPage = input.nextInt();
		book.setBookPage(BookPage);
	}
	
	public void viewBook() {
//	    System.out.print("BookNum:");
//	    int bookNum = input.nextInt();
	   for(int i =0; i<books.size(); i++) {
		   books.get(i).printInfo();
	    }
	}
}
