package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios4.ProcessadorDeDados;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ProcessadorDeDados pd = new ProcessadorDeDados();
        String[] arrayTest = new String[]{"a", "b", "c"};
        System.out.println("qual erro você quer testar?: ");
        System.out.println("=-=-=-=-Number, IndexoutofBounds, Null=-=-=-=-=-=-=-=-=");
        String erro = entrada.nextLine();

        if (erro.equalsIgnoreCase("Number")){
            pd.receberArray(arrayTest, "number");
        } else if (erro.equalsIgnoreCase("indexoutofbounds")){
            pd.receberArray(arrayTest, "indexoutofbounds");
        } else if (erro.equalsIgnoreCase("null")){
            pd.receberArray(arrayTest, "null");
        }


    }
}
