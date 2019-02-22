package com.bowling.exception;

public class BowlingException extends Exception {
	 
		private static final long serialVersionUID = 1L;
		
		public BowlingException(String message, Exception exception) {
			 super(message,exception); 
		}
}
