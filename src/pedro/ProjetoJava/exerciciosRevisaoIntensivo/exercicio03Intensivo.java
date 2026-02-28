package pedro.ProjetoJava.exerciciosRevisaoIntensivo;

public class exercicio03Intensivo {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("FDS");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("FDS");
                break;
            default:
                System.out.println("opçao invalida");
                break;
        }

        switch (dia) {
            case 1, 7 -> System.out.println("Fim De semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia util");
            default -> throw new IllegalArgumentException("Dia invalido: " + dia);
        }
    }

}
