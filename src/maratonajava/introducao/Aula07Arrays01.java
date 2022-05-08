package maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 12;
        idades[1] = 13;
        idades[2] = 14;
        //idades[3] = 18;

        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

    }
}
