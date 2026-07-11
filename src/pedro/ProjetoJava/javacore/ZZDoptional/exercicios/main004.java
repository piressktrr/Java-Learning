package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import java.util.function.Supplier;

public class main004 {
    public static void main(String[] args) {
        Supplier<String> sup = String::new;
        System.out.println(gerarRelatorio(false, sup));
        System.out.println("-----------------------------------");
        System.out.println(gerarRelatorio(true, sup));
    }

    private static String gerarRelatorio(boolean detalhado, Supplier<String> geradorDetalhes) {
        if (!detalhado) {
            geradorDetalhes = () -> "gerando NOVO relatorio...";
            return geradorDetalhes.get();
        } else {
            return "Gerando relatorio atual..";
        }
    }
}
