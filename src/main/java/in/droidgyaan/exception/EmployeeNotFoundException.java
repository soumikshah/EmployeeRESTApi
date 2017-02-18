package in.droidgyaan.exception;

public class EmployeeNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -362936654491251328L;
	public EmployeeNotFoundException(String message) {
	super(message);
	}
	public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
