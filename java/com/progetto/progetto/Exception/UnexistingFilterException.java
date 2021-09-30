package com.progetto.progetto.Exception;

/**rappresenta un'eccezione personalizzata
 * 
 * @author pietrobonsanto
 *
 */

	public class UnexistingFilterException extends ClassNotFoundException {
		private static final long serialVersionUID = 1L;

		public UnexistingFilterException() {
			super();
		}

		public UnexistingFilterException(String message) {
			super(message);
		}
	}
	
	
	
	

