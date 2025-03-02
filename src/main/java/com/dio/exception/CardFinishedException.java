package com.dio.exception;

public class CardFinishedException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CardFinishedException(final String message) {
        super(message);
    }
}
