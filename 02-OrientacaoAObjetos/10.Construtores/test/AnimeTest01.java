package com.codingloria.oop.constructors.test;

import com.codingloria.oop.constructors.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Haikyuu!!", "TV", 25, "Sports", "Production I.G");

        anime.print();
    }
}
