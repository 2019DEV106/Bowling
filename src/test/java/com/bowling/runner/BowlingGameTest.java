package com.bowling.runner;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class BowlingGameTest {
	@Test
	public void scoreGutterGame() {
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.roll(0);
		for (int i = 0; i < 20; i++) {
			bowlingGame.roll(0);
		}
		assertThat(bowlingGame.score(), is(0));
	}

	@Test
	public void scoreGameOfOnes() {
		BowlingGame bowlingGame = new BowlingGame();
		for (int i = 0; i < 20; i++) {
			bowlingGame.roll(1);
		}
		assertThat(bowlingGame.score(), is(20));
	}
}
