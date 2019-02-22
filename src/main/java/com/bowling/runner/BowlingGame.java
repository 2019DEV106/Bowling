package com.bowling.runner;

import org.apache.log4j.Logger;

import com.bowling.exception.BowlingException;

public class BowlingGame {

	private int roll = 0;
	private int[] rolls = new int[21];
	private static final Logger log = Logger.getLogger(BowlingGame.class);
	
	
	public void roll(int pinsDown) throws BowlingException {
		try {
			rolls[roll++] = pinsDown;
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new BowlingException("No of rolls Exhausted ", e);
		}
	}

	public int score() {
		int score = 0;
		int cursor = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (isStrike(cursor)) {
				score += 10 + rolls[cursor + 1] + rolls[cursor + 2];
				cursor++;
			} else if (isSpare(cursor)) {
				score += 10 + rolls[cursor + 2];
				cursor += 2;
			} else {
				score += rolls[cursor] + rolls[cursor + 1];
				cursor += 2;
			}
		}
		return score;
	}

	public boolean isStrike(int cursor) {
		return rolls[cursor] == 10;
	}

	public boolean isSpare(int cursor) {
		return rolls[cursor] + rolls[cursor + 1] == 10;
	}

	public void roll(int... rolls) throws BowlingException {
		for (int pinsDown : rolls) {
			roll(pinsDown);
		}
	}

	public static void main(String[] values) throws BowlingException {
		int[] rolls = new int[values.length];
		BowlingGame bowlingGame = new BowlingGame();
		for (int i = 0; i < values.length; i++) {
			try {
				rolls[i] = Integer.parseInt(values[i]);
			} catch (NumberFormatException e) {
				throw new BowlingException("Please provide valid numerical value", e);
			}
		}
		bowlingGame.roll(rolls);
		log.debug("Players bowling score");
		log.debug(bowlingGame.score());
	}
}
