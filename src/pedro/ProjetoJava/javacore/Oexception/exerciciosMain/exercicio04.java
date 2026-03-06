package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios4.ProcessadorDeDados;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ProcessadorDeDados pd = new ProcessadorDeDados();
        String[] arrayTest = new String[]{"a", "b", "c"};
        System.out.println("Qual erro você quer testar?: ");
        System.out.println("Disponíveis: NumberFormatException, ArrayIndexOutOfBoundsException, NullPointerException");
        System.out.println();
        System.out.println("Digite apenas do jeito que está abaixo!");
        System.out.println("=-=-=-=-=-=-=-=-=-Number, IndexoutofBounds, Null=-=-=-=-=-=-=-=-=");

        String erro = entrada.nextLine();

        try {
            if (erro.equalsIgnoreCase("Number")) {
                pd.receberArray(arrayTest, "number");
            } else if (erro.equalsIgnoreCase("Index")) {
                pd.receberArray(arrayTest, "indexoutofbounds");
            } else if (erro.equalsIgnoreCase("Null")) {
                pd.receberArray(arrayTest, "null");
            } else {
                System.out.println("Digite um erro que está listado!");
            }
        } catch (Exception e) {
            System.out.println("Erro - " + e.getMessage());
        }

    }
}
