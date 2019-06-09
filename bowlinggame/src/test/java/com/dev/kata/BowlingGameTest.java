package com.dev.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
	private BowlingGame game;
	
	@Before
	public void setUp() {
		 game = new BowlingGame();
	}
	@Test
	public void testGameScoreForGutterBalls() {
		
		for(int i=0;i<20;i++) {
			game.roll(0);
		}
		
		assertEquals(0, game.getScore());
	}
	
	@Test
	public void testGameScoreWhenPinsDown() {
		BowlingGame game = new BowlingGame();
		
		for(int i=0;i<20;i++) {
			game.roll(2);
		}
		
		assertEquals(40, game.getScore());
	}
}
