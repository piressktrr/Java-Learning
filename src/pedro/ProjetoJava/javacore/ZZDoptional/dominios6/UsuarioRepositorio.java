package pedro.ProjetoJava.javacore.ZZDoptional.dominios6;

import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class UsuarioRepositorio  {
    private List<Usuario> usuarios = List.of(
            new Usuario("Pedro", "pedrogh0", "12345"),
            new Usuario("Maria", "mariakap_", "maria123"));


    private static Supplier<Usuario> anon = () ->  new Usuario("ANONIMO", "#####", "#####");


    public Optional<Usuario> autenticar(String login, String senha) {
        Function<Usuario, Boolean> funcao = u1 -> u1.getLogin().equals(login) && u1.getSenha().equals(senha);


        for (Usuario usuario : usuarios) {
                Usuario fds =  Optional.of(usuario)
                    .filter(l -> l.getLogin().equalsIgnoreCase(login))
                    .filter(l -> l.getSenha().equals(senha))
                    .orElseGet(() -> anon.get());

                return Optional.of(fds);
//            funcao.apply(u); nao entendi como que eu posso usar essa função aqui, sinceramente
//            nem o porque de ser uma bifunction e não uma function normal
//            o filter/map ja não fazem o que essa interface irá fazer?
        }
        return Optional.empty();
    }

}
