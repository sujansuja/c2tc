package ExceptionHandling;

public class Service {
	public static boolean validateMarks(int[] marks) throws InvalidMarksException {
		for (int element : marks) {
			if (element > 100 || element < 0)
				throw new InvalidMarksException("Marks should be between 0 and 100");
		}
		return true;
	}
}
