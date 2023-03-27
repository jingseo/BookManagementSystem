import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	int num = 0;
	Scanner input = new Scanner(System.in);
	
	while (num !=4) {
		System.out.println("1.Add Book");
		System.out.println("2.Edit Book page");
		System.out.println("3.Delete Book");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-4: ");
		num = input.nextInt();
		if (num ==1) {
			System.out.print("책: ");
			String BookName = input.next();
			System.out.print("전체쪽수: ");
			String BookPage = input.next();
			break;
			
		}
		
		if (num==2) {
			System.out.print("책: ");
			String Name = input.next();
			System.out.print("읽은 쪽수: ");
			String Page = input.next();
			break;
			
		}
		
		if (num ==3) {
			
		}
		
	}
	}

}
