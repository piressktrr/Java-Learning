package pedro.ProjetoJava.javacore.Oexception.dominios3;

public class ValidadorDeSenhas {
    public void validarSenha(String senha) {
        if (senha.isBlank()) {
            throw new IllegalArgumentException("Senha vazia");
        } else if (senha.length() < 8) {
            throw new IllegalArgumentException("Senha deve ter mais de 8 caracteres");
        } else if (senha.chars().noneMatch(Character::isDigit)){
            throw new IllegalArgumentException("Senha precisa ter um numero");
        }
        System.out.println("Senha criada com sucesso!");
    }
}
