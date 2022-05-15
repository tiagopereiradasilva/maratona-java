package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.diminio.Manga;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
    /*
        Ignora elementos duplicados (levando em considerção o campareTo e não o equals como faz o Set)
        Quando construida com TreeSet, no exemplo: NavigableSet<Manga> mangas = new TreeSet<>(), os valores são ordenados
        de acordo com o compareTo da classe do tipo da coleção. Para isso é necessário que essa classe implemente a interface Comparable
        e sobrescreva o método compareTo.
        Outra forma de ordenar é criando uma classe que implementa Comparator e sobrescreve o método compare, no exemplo ficaria:

        class MangaPorNomeComparator implements Comparator<Manga>{
            @Override
            public int copare(Manga o1, Manga o2){
                return o1.getNome().comparaTo(o2.getNome);
            }
        }

        A criação da coleção seria assim: NavigableSet<Manga> mangas = new TreeSet<>(new MangaPorNomeComparator());
        Pois o contrutor da classe TreeSet também espera um Comparator.
     */
    public static void main(String[] args) {
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(3L, "Naruto", 20.00, 5));
        mangas.add(new Manga(1L, "Dragon Ball Z", 21.00, 12));
        mangas.add(new Manga(2L, "One Piece", 20.50, 0));
        mangas.add(new Manga(10L, "Attack on Titan", 21.00, 12));

        //pode-se inverter a
        for(Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
