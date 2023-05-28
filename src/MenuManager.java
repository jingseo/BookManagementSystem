import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import exception.WiterFormatException;
import log.EventLogger;


public class MenuManager {
	private static final String BookManager = null;
	static EventLogger logger = new EventLogger("log.txt");


	public static void main(String[] args) throws WiterFormatException {
		Scanner input = new Scanner(System.in);

		BookManager bookManager = getObject("bookmanager.ser");
		if(bookManager == null) {
			bookManager = new BookManager(input);
		}
		selectMenu(input, bookManager);
		try {
			putObject(bookManager, "bookmanager.ser");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static BookManager getObject(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void selectMenu(Scanner input, BookManager bookManager) throws WiterFormatException {

		int num = -1;
		while (num !=5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					bookManager.addBook();
					logger.log("add Book");
					break;
				case 2:
					bookManager.editBookPage();
					logger.log("edit Book");
					break;
				case 3:
					bookManager.deleteBook();
					logger.log("delete Book");
					break;
				case 4:
					bookManager.viewBook();
					logger.log("view a list of Book");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}

		}
	}

	public static void showMenu() {
		System.out.println("**** Book Management System Menu ****");
		System.out.println("1.Add Book");
		System.out.println("2.Edit Book page");
		System.out.println("3.Delete Book");
		System.out.println("4.View Books");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5: ");

	}

	public static BookManager putObject(BookManager bookManager, String filename) throws ClassNotFoundException {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out =new ObjectOutputStream(file);

			out.writeObject(BookManager);	
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			return bookManager;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bookManager;
	}

}




