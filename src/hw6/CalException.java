package hw6;

/**
 * CalException異常類
 */
public class CalException extends Exception {
	@java.io.Serial
	private static final long serialVersionUID = -922019114229948L;

	public CalException() {
	}

	public CalException(String message) {
		super(message);
	}
}
