package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Tiago");
        nomes.add("Pedro");
        nomes2.add("Tiago");
        nomes2.add("Thiago");
        nomes.addAll(nomes2);
        System.out.println(nomes);

    }
}
