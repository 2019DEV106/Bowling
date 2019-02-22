package com.bowling.exception;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BowlingExceptionTest extends Exception {

	private static final long serialVersionUID = 1L;

	@Test
	public void testBowlingException() {
		BowlingException bowlingException = new BowlingException("test", new Exception());
		assertEquals("test", bowlingException.getMessage());
	}
}
