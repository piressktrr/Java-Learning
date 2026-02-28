package pedro.ProjetoJava.exerciciosRevisaoInternet;

public class exercicio01Internet {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int temporario = a;
        a = b;
        b = temporario;
        System.out.println(a);
        System.out.println(b);
    }
}
