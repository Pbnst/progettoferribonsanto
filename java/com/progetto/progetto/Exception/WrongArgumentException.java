package com.progetto.progetto.Exception;
/**eccezione personalizzzta del tipo illegalargumentexception
 * 
 * @author pietrobonsanto
 *
 */
public class WrongArgumentException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;

	public WrongArgumentException() {
		super();
	}

	public WrongArgumentException(String message) {
		super(message);
	}

}


