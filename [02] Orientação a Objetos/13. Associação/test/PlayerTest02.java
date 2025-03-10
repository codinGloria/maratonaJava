package com.codingloria.oop.association.test;

import com.codingloria.oop.association.domain.Player;
import com.codingloria.oop.association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team1 = new Team("Seleção Brasileira");

        player1.setTeam(team1);
        player1.print();
    }
}
