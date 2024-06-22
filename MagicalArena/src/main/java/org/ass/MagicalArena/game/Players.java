package org.ass.MagicalArena.game;

public class Players {
	
	private int health;
	private int strength;
	private int attack;
	
	public Players(int health, int strength, int attack) {
		super();
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}
	
	
	public void reduceHealth(int damage) {
		this.health-=damage;
		if(this.health<0)this.health=0;
	}
	public boolean isAlive() {
		return this.health>0;
	}
	
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}


	@Override
	public String toString() {
		return "Players [health=" + health + ", strength=" + strength + ", attack=" + attack + "]";
	}
	
	
	

}
