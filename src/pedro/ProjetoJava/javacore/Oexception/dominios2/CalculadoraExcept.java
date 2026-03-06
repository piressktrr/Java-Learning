package pedro.ProjetoJava.javacore.Oexception.dominios2;

public class CalculadoraExcept {

    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public  double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public  double dividir(double valor1, double valor2) {
        if (valor1 == 0 || valor2 == 0)
            throw new ArithmeticException();
        return valor1 / valor2;
    }
}
