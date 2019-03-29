package dev.top.exception;

public class TopColleguesException extends RuntimeException {

	public TopColleguesException(String message, Throwable cause) {
		super(message, cause);
	}

	public TopColleguesException(String message) {
		super(message);
	}

	public TopColleguesException(Throwable cause) {
		super(cause);
	}

}
