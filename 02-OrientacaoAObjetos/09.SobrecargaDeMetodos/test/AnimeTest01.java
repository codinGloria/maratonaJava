package com.codingloria.oop.sobrecargaMetodos.test;

import com.codingloria.oop.sobrecargaMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 220, "Shounen");
        anime.imprime();

        // O java permite que você nomeie vários métodos com o mesmo nome,
        // desde que a lista de parâmetros seja diferente.
    }
}
