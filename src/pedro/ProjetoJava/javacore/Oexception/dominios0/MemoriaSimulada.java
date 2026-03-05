package pedro.ProjetoJava.javacore.Oexception.dominios0;

public class MemoriaSimulada {
    public void metodoRecebeInteiro(int a) throws TamanhoInvalidoException {
        if (a > 1000) {
            throw new MemoriaInsuficienteError();
        } else if (a < 0) {
            throw new TamanhoInvalidoException();
        }
    }
}
