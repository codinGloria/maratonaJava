package com.codingloria.oop.constructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String genre;
    private String studio;

    public Anime() {
        System.out.println("Inside the default constructor.");
    }

    public Anime(String name, String type, int episodes, String genre) {
        this(); // Can be called only in the constructors AND obligatory to be the first statement
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Anime(String name, String type, int episodes, String genre, String studio) {
        this(name, type, episodes, genre);
        this.studio = studio;
    }

    public void print() {
        System.out.println("----------------------");
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
        System.out.println(this.studio);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
