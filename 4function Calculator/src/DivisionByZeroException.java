
public class DivisionByZeroException extends Exception{

	private static final long serialVersionUID = 1L;

	public DivisionByZeroException() {
		super("You cannot divide by ZERO\nTry again");
	}

	public DivisionByZeroException(String message) {
		super(message);
	}
	
}
