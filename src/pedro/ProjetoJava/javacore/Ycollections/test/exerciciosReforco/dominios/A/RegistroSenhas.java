package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegistroSenhas {
    private List<Senha> senhas = new ArrayList<>();

    public void adicionar(Senha s) {
        if (s.getUsuario() == null || s.getValor() == null || s.getUsuario().isBlank() || s.getValor().isBlank()) {
            throw new IllegalArgumentException("usuario e/ou senha em branco ou nulo");
        }

        if (!this.senhas.contains(s)) {
            this.senhas.add(s);
        }
    }

    public Optional<Senha> buscarPorUsuario (String usuario) {
        for (Senha senha : this.senhas) {
            if (usuario.equalsIgnoreCase(senha.getUsuario())) {
                return Optional.of(senha);
            }
        }
        return Optional.empty();
    }

    public List<Senha> listar() {
        return this.senhas;
    }

    @Override
    public String toString() {
        return "RegistroSenhas{" +
                "senhas=" + senhas +
                '}';
    }
}
