package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import pedro.ProjetoJava.javacore.ZZDoptional.dominios3.Pedido;
import pedro.ProjetoJava.javacore.ZZDoptional.dominios3.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class main003 {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(30, 40.0, Status.PREPARANDO);
        Pedido pedido2 = new Pedido(40, 25.0, Status.PRONTO);
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

//        Function<Integer, String> is = s -> s.toString();
        Function<Integer, String> is = String::valueOf;

        String numToString = is.apply(pedido1.getNumero());
        System.out.println(numToString);

        //tipo 2
        Supplier<String> supplier = pedido1::getStatus;
        System.out.println(supplier.get());

        //Function<Integer, Double> d = i -> i.doubleValue();
        Function<Integer, Double> d = Integer::doubleValue;
        // aqui ele transforma o integer em double e retorna
        Double intToDouble = d.apply(pedido2.getNumero());
        System.out.println(intToDouble);

        // nao tem muito oq comentar aqui, ele faz os pedidos to string e printa tudo
        pedidos.stream().map(Pedido::toString).forEach(System.out::println);

        Supplier<ArrayList<Pedido>> sup = ArrayList::new;
        List<Pedido> novaLista =  sup.get();
        System.out.println(novaLista);

    }
}
