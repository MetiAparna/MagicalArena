package org.ass.MagicalArena.game;

import java.util.Random;

public class Dice {
	
	private static final int sides=6;
	private Random random;
	
	public Dice() {
		random=new Random();
	}
	public int roll() {
		return random.nextInt(sides)+1;
	}

}
