package maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana. considerando 1 como domingo.
        byte dia = 10;
        String menssagemDia;
        switch (dia){
            case 1:
                menssagemDia = "Domingo";
                break;
            case 2:
                menssagemDia = "Segunda";
                break;
            case 3:
                menssagemDia = "Terça";
                break;
            case 4:
                menssagemDia = "Quarta";
                break;
            case 5:
                menssagemDia = "Quinta";
                break;
            case 6:
                menssagemDia = "Sexta";
                break;
            case 7:
                menssagemDia = "Sábado";
                break;
            default:
                menssagemDia = "Não foi possível encontrar um dia da semana!";
        }

        System.out.println("O dia da semana é: "+menssagemDia);
    }
}
