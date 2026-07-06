package pedro.ProjetoJava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest02 {
    public static void main(String[] args) {
        List<String> lista = List.of("Pedro", "Maria", "Joao");
        List<String> listaMaiuscula = mapa(lista, l -> l.toUpperCase());
        // l = t, l.length() = r
        // (tipo e retorno)
        System.out.println(listaMaiuscula);
    }

    private static <T, R> List<R> mapa(List<T> lista, Function<T,R > funcao){
        List<R>  resultado = new ArrayList<>();
        for (T objetoT : lista) {
            R objetoR = funcao.apply(objetoT);
            resultado.add(objetoR);
        }
        return resultado;
    }
}
