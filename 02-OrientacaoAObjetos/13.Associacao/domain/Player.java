package com.codingloria.oop.association.domain;

public class Player {
    private String name;
    private Team team;

    public void print(){
        System.out.println("Player: " + this.name);
        if (team != null) {
            System.out.println("Team: " + this.team.getName());
        }
    }

    public Player(String name) {
        this.name = name;
    }


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
