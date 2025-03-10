package com.codingloria.oop.association.test;

import com.codingloria.oop.association.domain.Player;
import com.codingloria.oop.association.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Cafu");
        Player player2 = new Player("Ronaldo");
        Team team1 = new Team("Brasil");
        Player[] players = {player1, player2};

        player1.setTeam(team1);
        player2.setTeam(team1);
        team1.setPlayers(players);

        System.out.println("----> Player <---");
        player1.print();

        System.out.println("----> Team <---");
        team1.print();
    }
}
