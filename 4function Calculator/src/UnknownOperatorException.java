
public class UnknownOperatorException extends Exception{

	private static final long serialVersionUID = 1L;

	public UnknownOperatorException() {
		super("Unknown Operator\nTry again");
	}

	public UnknownOperatorException(String message) {
		super(message);
	}
	
}
