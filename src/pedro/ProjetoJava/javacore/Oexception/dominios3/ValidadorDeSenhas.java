package pedro.ProjetoJava.javacore.Oexception.dominios3;

public class ValidadorDeSenhas {
    public void validarSenha(String senha) throws IllegalArgumentException {
        if (senha.isBlank() || senha.length() < 8) {
            throw new IllegalArgumentException("Senha deve ter mais de 8 caracteres ou não ser vazia");
        } else if (senha.chars().noneMatch(Character::isDigit)){
            throw new IllegalArgumentException("Senha precisa ter um numero");
        }
        System.out.println("Senha criada com sucesso!");
    }
}
