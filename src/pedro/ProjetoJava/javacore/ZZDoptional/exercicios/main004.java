package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import java.util.function.Supplier;

public class main004 {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "gerando relatorio NOVO";
        System.out.println(gerarRelatorio(false, sup));
        System.out.println("-----------------------------------");
//        System.out.println(gerarRelatorio(true, sup));
    }

    private static String gerarRelatorio(boolean detalhado, Supplier<String> geradorDetalhes) {
        if (detalhado) {
            System.out.println("Gerando detalhes...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            return geradorDetalhes.get();
        } else {
            System.out.println("Erro..");
            return "Gerando relatorio atual..";
        }
    }
}
