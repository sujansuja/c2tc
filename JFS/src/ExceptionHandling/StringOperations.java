package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int startIndex, endIndex;

			String message, str;

			System.out.println("Enter the message: ");
			message = scanner.nextLine();
			System.out.println("Enter the start Index and End Index: ");
			startIndex = scanner.nextInt();
			endIndex = scanner.nextInt();

			str = message.substring(startIndex, endIndex);
			System.out.println("The extracted message is : " + str);
			scanner.close();
		} catch (StringIndexOutOfBoundsException | InputMismatchException e) {
			System.out.println("Error! " + e.getMessage());
		}
	}
}
