package pedro.ProjetoJava.javacore.Oexception.dominios1;

public class LeitorDeIdade {
    public void leitorDeIdade(String idade) throws IdadeInvalidaException {
        int idadeInt = Integer.parseInt(idade);
        // voltar aqui pq ele pede pra passar um numberformatexception mas eu nao entendi o por que, sendo q o metodo
        // ja passa uma string e depois converte pra int.

        if (idadeInt < 0 || idadeInt > 150) {
            throw new IdadeInvalidaException();
        }
    }
}
