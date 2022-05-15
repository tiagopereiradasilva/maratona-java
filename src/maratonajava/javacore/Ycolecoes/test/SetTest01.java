package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.diminio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        /*
         * A Collection Set não aceita valores duplicados. (Ao inserir um valor duplicad, ele simplesmente é ignorado)
         * Ela utiliza o hash para ordenar seus elementos, sendo assim, o ideal é ter o método "hashCode" sobrescrito no
         * modelo que é o Tipo da lista, no exemplo é a classe Mangá.
         * A partir disso, ela cria sua própria forma de organização dos elemenos, não obdecendo, necessariamente, a ordem
         * que foram adicionados.
         * Caso queira que ela mantenha a ordem de inserção dos elementos, a mesma pode ser contruida a partir de um LinkedHashSet;
         * no exemplo ficaria: Set<Manga> mangas = new LinkedHashSet<>();
         *
         * Outro ponto a se ressaltar é p fato de não ser possível buscar um elemento a partir do get().
         */
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(3L, "Naruto", 20.00, 0));
        mangas.add(new Manga(1L, "Dragon Ball Z", 21.00, 12));
        mangas.add(new Manga(2L, "One Piece", 20.50, 0));
        // Valor duplicado que será ignorado.
        mangas.add(new Manga(2L, "One Piece", 20.50, 0));

        for(Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
