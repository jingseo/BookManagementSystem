package book;

import java.util.Scanner;

public interface BookInput {
	
	public int getBookNum();
	
	public void setBookNum(int bookNum);
	
	public void setBookWriter(String bookWriter);
	
	public void setBookName(String bookName);
	
	public void setBookPage(int bookPage);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);

}
