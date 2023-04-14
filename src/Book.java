
public class Book {
	int BookNum;
	String BookName;
	String BookWriter;
	int BookPage;
	
	public Book() {
	
	}
	
	public Book(int BookNum, String BookName ) {
		this.BookNum = BookNum;
		this.BookName = BookName;
		
	}
	
	public Book(int BookNum, String BookName, String BookWriter) {
		this.BookNum = BookNum;
		this.BookName = BookName;
		this.BookWriter = BookWriter;
	}
	
	public Book(int BookNum, String BookName, String BookWriter, int BookPage) {
		this.BookNum = BookNum;
		this.BookName = BookName;
		this.BookWriter = BookWriter;
		this.BookPage = BookPage;
	}
	
	public void printInfo() {
		System.out.println("BookNum:"+ BookNum + "BookName:"+ BookName + "BookWriter:"+ BookWriter+ "BookPage:"+ BookPage);
	}
}
