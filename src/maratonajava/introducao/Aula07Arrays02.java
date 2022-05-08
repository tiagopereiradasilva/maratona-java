package maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Luffy";
        nomes[1] = "Zoro";
        nomes[2] = "Sanji";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
