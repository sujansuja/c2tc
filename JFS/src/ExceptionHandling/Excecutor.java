package ExceptionHandling;

import java.util.Scanner;

public class Excecutor {

	public static void main(String[] args) throws InvalidMarksException {
		try {
			Scanner sc = new Scanner(System.in);

			Student sOne = new Student();

			System.out.print("Enter the roll no: ");
			int rollNo = sc.nextInt();
			sOne.setRollNo(rollNo);

			System.out.print("Enter the name: ");
			String name = sc.nextLine();
			sOne.setName(name);

			System.out.print("Enter the no of subjects: ");
			int subs = sc.nextInt();
			sOne.setNoOfSubjects(subs);

			System.out.print("Enter the marks of " + subs);
			int[] intArr = new int[subs];
			float sum = 0;
			for (int i = 0; i < subs; i++) {
				intArr[i] = sc.nextInt();
				sum += intArr[i];
			}
			sOne.setPercentage(sum / (subs));
			if (Service.validateMarks(intArr)) {
				sOne.setMarks(intArr);
			}

			System.out.println(sOne);
		} catch (InvalidMarksException e) {
			System.err.println(e.getMessage());
		}
	}

}
