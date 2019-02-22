package com.bowling.runner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.bowling.exception.BowlingException;

public class BowlingGameTest {

	private BowlingGame bowlingGame;

	@Before
	public void setUp() {
		bowlingGame = new BowlingGame();
	}

	@Test
	public void scoreGutterGame() throws BowlingException {
		bowlingGame.roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(0));
	}

	@Test(expected = BowlingException.class)
	public void scoreGutterGameWithExhaustedRolls() throws BowlingException {
		bowlingGame.roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(0));
	}

	@Test
	public void scoreGameOfOnes() throws BowlingException {
		bowlingGame.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		assertThat(bowlingGame.score(), is(20));
	}

	@Test(expected = BowlingException.class)
	public void scoreGameOfOnesWithExhaustedRolls() throws BowlingException {
		bowlingGame.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		assertThat(bowlingGame.score(), is(20));
	}

	@Test
	public void scoreSpareFollowedByThree() throws BowlingException {
		bowlingGame.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(16));
	}

	@Test(expected = BowlingException.class)
	public void scoreSpareFollowedByThreeWithExhaustedRolls() throws BowlingException {
		bowlingGame.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(16));
	}

	@Test
	public void scoreStrikeFollowedByThreeThenThree() throws BowlingException {
		bowlingGame.roll(10, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(22));
	}

	@Test(expected = BowlingException.class)
	public void scoreStrikeFollowedByThreeThenThreeWithExhaustedRolls() throws BowlingException {
		bowlingGame.roll(10, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(22));
	}

	@Test
	public void scorePerfectGame() throws Exception {
		bowlingGame.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
		assertThat(bowlingGame.score(), is(300));
	}

	@Test(expected = BowlingException.class)
	public void scorePerfectGameWithExhaustedRolls() throws BowlingException {
		bowlingGame.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10);
		assertThat(bowlingGame.score(), is(300));
	}

	@Test
	public void scorePassingNegativeValues() throws BowlingException {
		bowlingGame.roll(-10, -3, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertThat(bowlingGame.score(), is(-16));
	}
	
}
