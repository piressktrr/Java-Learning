package pedro.ProjetoJava.javacore.Oexception.dominios1;

public class LeitorDeIdade {
    public void leitorDeIdade(String idade) throws IdadeInvalidaException {
        int idadeInt = Integer.parseInt(idade);
        if (idadeInt < 0 || idadeInt > 150) {
            throw new IdadeInvalidaException();
        }
    }
}
