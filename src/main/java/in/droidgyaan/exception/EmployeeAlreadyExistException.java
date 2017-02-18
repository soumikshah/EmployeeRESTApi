package in.droidgyaan.exception;

public class EmployeeAlreadyExistException extends RuntimeException{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = -5283288957650722959L;
	public EmployeeAlreadyExistException(String message) {
		super(message);
	}
	public EmployeeAlreadyExistException(String message, Throwable cause) {
		super(message,cause);
	}
}
