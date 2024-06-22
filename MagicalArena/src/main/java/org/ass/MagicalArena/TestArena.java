package org.ass.MagicalArena;

import org.ass.MagicalArena.game.ArenaFighting;
import org.ass.MagicalArena.game.Dice;
import org.ass.MagicalArena.game.Players;

public class TestArena {
	

	    
	    @SuppressWarnings("unlikely-arg-type")
		public void testPlayerInitialization() {
	        Players player = new Players(50, 5, 10);
	        equals( player.getHealth());
	        equals( player.getStrength());
	       equals( player.getAttack());
	    }

	    
	    @SuppressWarnings("unlikely-arg-type")
		public void testDiceRoll() {
	        Dice dice = new Dice();
	        int roll = dice.roll();
	        equals(roll >= 1 && roll <= 6);
	    }

	    
	    @SuppressWarnings("unlikely-arg-type")
		public void testArenaFight() {
	        Players playerA = new Players(50, 5, 10);
	        Players playerB = new Players(100, 10, 5);

	        ArenaFighting  arena = new ArenaFighting(playerA, playerB);
	        arena.startFight();

	        equals(playerA.getHealth() == 0 || playerB.getHealth() == 0);
	    }
	}
	


