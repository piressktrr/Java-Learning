package pedro.ProjetoJava.exerciciosRevisaoIntensivo;

public class exercicio04Intensivo {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int fibonnaci = 1;

        for (int i = 1; i <= 10; i++) {
            num1 = num2;
            num2 = fibonnaci;
            System.out.println(fibonnaci);
            fibonnaci += num1;

        }

    }
}
