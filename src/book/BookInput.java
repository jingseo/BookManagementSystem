package book;

import java.util.Scanner;

import exception.WiterFormatException;

public interface BookInput {
	
	public int getBookNum();
	
	public void setBookNum(int bookNum);
	
	public void setBookWriter(String bookWriter) throws WiterFormatException;
	
	public void setBookName(String bookName);
	
	public void setBookPage(int bookPage);
	
	public void printInfo();
	
	public void getUserInput(Scanner input) throws WiterFormatException;
	
	public void setBookNum(Scanner input);
	
	public void setBookName(Scanner input);
	
	public void setBookWriter( Scanner input);
	
	public void setBookPage(Scanner input);	
	

}
