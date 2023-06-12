package book;

import java.util.Scanner;
import exception.WiterFormatException;

public interface BookInput {
	

	public int getBookNum();
	public void setBookNum(int bookNum);
	
	public String getBookName();
	public void setBookName(String bookName);
	
	
	public void setBookWriter(String bookWriter) throws WiterFormatException;

	
	public void printInfo();
	public void setBookPage(int bookPage);
	public void setBookNum(Scanner input);
	

	public void getUserInput(Scanner input) throws WiterFormatException;

	public void setBookName(Scanner input);

	public void setBookWriter( Scanner input) throws WiterFormatException;
	public String getBookWriter(String name);
	public int getBookPage(int page);

	public void setBookPage(Scanner input);
	public Object getBookWriter();	


}
