package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class calculadora025 {

    public static double somar (double a, double b) {
        return a + b;
    }
    public static double subtrair (double a, double b) {
        return a - b;
    }
    public static double multiplicar (double a, double b) {
        return a * b;
    }
    public  static double dividir (double a, double b) {
        if (a == 0 || b == 0) {
            System.out.println("Erro ao dividir");
        }
        return a / b;
    }

}
