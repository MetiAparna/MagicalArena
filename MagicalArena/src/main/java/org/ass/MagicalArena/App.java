package org.ass.MagicalArena;

import org.ass.MagicalArena.game.ArenaFighting;
import org.ass.MagicalArena.game.Players;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Players player1 = new Players(50,5,10);
        Players player2 = new Players(100,10,5);
        
        ArenaFighting arenaFighting = new ArenaFighting(player1,player2);
        arenaFighting.startFight();
        
        
        
        
    }
}
/*
# Magical Arena

## Overview
This is a simple simulation of a magical arena where two players fight until one player's health reaches zero.

## How to Run
1. Compile the code:
   ```
*/
