package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios2.CalculadoraExcept;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculadoraExcept calculadora = new CalculadoraExcept();
        int [][] array = {{10, 20}, {8, 0}, {15,3}};
        int sucesso = 0, falha = 0;

        for (int[] ints : array) {
            try {
                double resultado = calculadora.dividir(ints[0], ints[1]);
                System.out.println("Resultado:  " + resultado);
                sucesso++;
            } catch (ArithmeticException e) {
                System.out.println("Erro, divisao por zero: "+e.getMessage());
                falha++;
            } finally {
                System.out.println("Operaçao encerrada!");
            }
            System.out.println("=-=-=-=-=-=-");
        }
        System.out.println("Operacoes com sucesso: "+sucesso);
        System.out.println("Falha: "+falha);
    }
}
