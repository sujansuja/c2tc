package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Program running...");
		int numberOne, numberTwo, numberThree;
		Scanner sc = new Scanner(System.in);
		while (true) {

			try {
				numberOne = sc.nextInt();
				numberTwo = sc.nextInt();
				numberThree = numberOne / numberTwo;
				System.out.println("Division is: " + numberThree);
				break;
			} catch (ArithmeticException e) {
				System.err.println("Exception caught: " + e.getMessage());
//			Unreachable catch block for InputMismatchException. It is already handled by the catch block for Exception
//			catch (Exception e) {
//			Should use Exception hierarchically
			} catch (InputMismatchException e) {
				System.err.println("Invalid Input!!! Enter integers only");
			} catch (Exception e) {
				System.err.println("Exception caught: " + e.getMessage());
			}
//			catch (InputMismatchException | ArithmeticException e)
//			catch (InputMismatchException | ArithmeticException | Exception e)  doesnt work
		}
		System.out.println("End");
		sc.close();
	}

}
