package pedro.ProjetoJava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {

        Optional<String> nameOptional = findByName("pedro");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(nameOptional.orElse("NAO TEM ESSE NOME"));
    }

    private static Optional<String> findByName (String s){
        List<String> lista = List.of("Pedro", "Luiz", "Arroz");
        if (lista.contains(s)){
            return Optional.of(s);
        }

        return Optional.empty();
    }
}
