package com.codingloria.oop.staticModificator.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    // On the execution order, consider the 0 index of execution order
    // The static block is executed before the constructor
    // Executed when the JVM loads the class

    static {
        System.out.println("Inside static initialization block");

        episodes = new int[100];

        for (int i = 0; i < 100; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside static initialization block 2");
    }

    static {
        System.out.println("Inside static initialization block 3");
        // This block is executed only once
    }

    {
        System.out.println("Inside instance initialization block");
        // This block is executed every time an object is created
    }


    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }

        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
