package pedro.ProjetoJava.javacore.ZZDoptional.dominios6;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsuarioRepositorio  {
    private List<Usuario> usuarios = List.of(
            new Usuario("Pedro", "pedrogh0", "12345"),
            new Usuario("Maria", "mariakap_", "maria123"));


    private static Supplier<Usuario> anon = () ->  new Usuario("ANONIMO", "#####", "#####");


    public Optional<Usuario> autenticar(String login, String senha) {
        BiFunction<String, String, Boolean> funcaoValidarFinal = String::equals;
        BiFunction<String, String, Boolean> funcaoValidarLogin = String::equalsIgnoreCase;

        Usuario u = usuarios.stream()
                .filter(f -> funcaoValidarLogin.apply(f.getLogin(), login))
                .filter(v -> funcaoValidarFinal.apply(v.getSenha(), senha))
                .findFirst()
                .orElseGet(() -> anon.get());


        return Optional.ofNullable(u);

    }

}
