package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios2.CalculadoraExcept;

public class exercicio02 {
    public static void main(String[] args) {
        CalculadoraExcept calculadora = new CalculadoraExcept();
        int a = 1;
        int b = 0;
        int[] arrayPares = new int[]{2,0,6,8,10}; // criar um array 2d aqui

        for (int i = 0; i < arrayPares.length; i++) {
            System.out.println(calculadora.dividir(arrayPares[i], arrayPares[i+1]));

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        }

        // voltar nesse depois, ficou confuso a pergunta do claude
    }
}
