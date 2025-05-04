package com.codingloria.oop.initializationBlocks.test;

import com.codingloria.oop.initializationBlocks.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
