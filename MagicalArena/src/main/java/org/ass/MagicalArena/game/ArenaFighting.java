package org.ass.MagicalArena.game;

public class ArenaFighting {
	
	private Players player1;
	private Players player2;
	private Dice dice;
	public ArenaFighting(Players player1, Players player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.dice=new Dice();
	}

	 public void startFight() {
	        while (player1.isAlive() && player2.isAlive()) {
	        	
	            Players attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
	            Players defender = attacker == player1 ? player2 : player1;
	            
	            performAttack(attacker, defender);

	            if (!defender.isAlive()) {
	                System.out.println(defender + "  is dead. " + attacker + " wins!");
	                break;
	            }

	            // Swap roles for the next round
	            Players temp = attacker;
	            attacker = defender;
	            defender = temp;
	            performAttack(attacker, defender);

	            if (!defender.isAlive()) {
	                System.out.println(defender + " defender player is dead. " + attacker + " Attacker is  wins!");
	                break;
	            }
	        }
	    }

	    private void performAttack(Players attacker, Players defender) {
	        int attackRoll = dice.roll();
	        int defenseRoll = dice.roll();
	        int damage = (attacker.getAttack() * attackRoll) - (defender.getStrength() * defenseRoll);

	        if (damage > 0) {
	            defender.reduceHealth(damage);
	        }
	        System.out.println(attacker + " attacked " + defender + " causing " + damage + " damage. " + defender + " has " + defender.getHealth() + " player health is left.");
	    }

}
