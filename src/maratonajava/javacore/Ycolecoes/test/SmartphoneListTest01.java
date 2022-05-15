package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.diminio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("A1B2C3", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Nokia");
        Smartphone s3 = new Smartphone("1111", "Xiaomi");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }

        //simulando entrada dublicada por parte do usuário. (replica do s2)
        Smartphone s4 = new Smartphone("22222", "Nokia");
        System.out.println(smartphones.contains(s4)); // necessita da sobrescrita do "equals e hashcode" na classe da List.
        System.out.println(smartphones.indexOf(s4));
    }
}
