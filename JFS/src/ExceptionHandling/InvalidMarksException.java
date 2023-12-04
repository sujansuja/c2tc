package ExceptionHandling;

public class InvalidMarksException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidMarksException() {
		super();
	}

	public InvalidMarksException(String string) {
		super();
		System.out.println(string);
	}

}
