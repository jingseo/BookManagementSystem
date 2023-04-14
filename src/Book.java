
public class Book {

	String BookName;
	String BookWriter;
	int BookPage;
	
	public Book() {
	
	}
	
	public Book(String BookName, String BookWriter) {
		this.BookName = BookName;
		this.BookWriter = BookWriter;
	}
	
	public Book(String BookName, String BookWriter, int BookPage) {
		this.BookName = BookName;
		this.BookWriter = BookWriter;
		this.BookPage = BookPage;
	}
	
	public void printInfo() {
		System.out.println("BookName:"+ BookName+ "BookWriter:"+ BookWriter+ "BookPage:"+ BookPage);
	}
}
