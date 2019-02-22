package com.bowling.runner;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;

public class BowlingGameTest {
	
	private BowlingGame bowlingGame;

	@Before
	public void setUp() {
		bowlingGame = new BowlingGame();
	}

	@Test
	public void scoreGutterGame() {
		roll(20, 0);
		assertThat(bowlingGame.score(), is(0));
	}

	@Test
	public void scoreGameOfOnes() {
		roll(20, 1);
		assertThat(bowlingGame.score(), is(20));
	}
	
	@Test
	public void scoreSpareFollowedByThree() {
		bowlingGame.roll(5);
		bowlingGame.roll(5);
		bowlingGame.roll(3);
		roll(17, 0);
		assertThat(bowlingGame.score(), is(16));
	}

	public void roll(int times, int pinsDown) {
		for (int i = 0; i < times; i++) {
			bowlingGame.roll(pinsDown);
		}
	}
}
