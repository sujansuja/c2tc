package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			System.out.println(num % 2 == 0 ? "is even" : "is odd");
//			return;
			System.exit(0);
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input");
		} finally {
			System.out.println("Finally Block");
			sc.close();
		}

	}

}
