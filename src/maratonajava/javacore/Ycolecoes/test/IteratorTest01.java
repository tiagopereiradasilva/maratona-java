package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.diminio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L, "Naruto", 20.00, 0));
        mangas.add(new Manga(4L, "Dragon Ball Z", 21.00, 12));
        mangas.add(new Manga(2L, "One Piece", 20.50, 0));
        System.out.println("Lista inicialmente");
        System.out.println("-------------------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }
        //Utiliza-se Iterator para remover ou add elementos em uma lista (alterar sua dimessão)
        Iterator<Manga> mangasIterator = mangas.iterator();
        while(mangasIterator.hasNext()){
            if(mangasIterator.next().getQuantidade() == 0){
                mangasIterator.remove();
            }
        }
        System.out.println("\nLista após remoção");
        System.out.println("-------------------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
