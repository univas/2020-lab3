package br.edu.univas.exception;

public class TelefoneException extends RuntimeException {

	private static final long serialVersionUID = 280221784597098229L;

	public TelefoneException() {
		super();
	}

	public TelefoneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TelefoneException(String message, Throwable cause) {
		super(message, cause);
	}

	public TelefoneException(String message) {
		super(message);
	}

	public TelefoneException(Throwable cause) {
		super(cause);
	}
	
}
