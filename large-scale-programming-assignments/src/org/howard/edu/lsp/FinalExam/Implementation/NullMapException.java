package org.howard.edu.lsp.FinalExam.Implementation;

public class NullMapException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullMapException() {
		super("Check your input, one or both of them are null");
	}

}
