package com.codingloria.oop.initializationBlocks.domain;

public class Anime {
    private String name;
    private int[] episodes;

     /* ======== Execution order ========
     1. Alocating memory for the object
     2. Each class attribute is created and initialized with default values or the values assigned
     3. Initialization block is executed
     4. Constructor is executed
     */

    {
        // An initialization block is executed before the constructor,
        // and it is executed every time an object is created.
        System.out.println("Inside initialization block");

        episodes = new int[100];

        for (int i = 0; i < 100; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : this.episodes) {
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
