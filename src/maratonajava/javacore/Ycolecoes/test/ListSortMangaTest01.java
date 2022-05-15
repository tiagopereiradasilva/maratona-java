package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.diminio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortMangaTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L, "Naruto", 20.00));
        mangas.add(new Manga(4L, "Dragon Ball Z", 21.00));
        mangas.add(new Manga(2L, "One Piece", 20.50));
        System.out.println("Lista original:");
        System.out.println("---------------");
        for (Manga manga: mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("\nLista ordenada por id:");
        System.out.println("---------------");
        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
