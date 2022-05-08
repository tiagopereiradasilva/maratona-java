package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 5000d;
        String mensagemDoar = "Eu vou doar 500,00 reais!";
        String mensagemNaoDoar = "Ainda não tenho condições de doar!";

        String mensagemFinal = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(mensagemFinal);

    }
}
