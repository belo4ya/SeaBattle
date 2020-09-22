package com.java;

import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, InterruptedException {
        SeaMap mapOne = new SeaMap();
        SeaMap mapTwo = new SeaMap();

        Player playerOne = new Player("Capitan", mapOne, mapTwo);
        RandomIntelligence playerTwo = new RandomIntelligence(mapTwo, mapOne);

        Game gameSession = new Game(playerOne, playerTwo);
        gameSession.startGame();
    }
}
