package com.codingloria.oop.association.test;

import com.codingloria.oop.association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Luffy");
        Player player2 = new Player("Zoro");
        Player player3 = new Player("Nami");

        // We can create an array of Player objects in three ways:
        // Player[] players = new Player[3];
        // Player[] players = new Player[]{player1, player2, player3};
        // Player[] players = {player1, player2, player3};

        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.print();
        }
    }
}
