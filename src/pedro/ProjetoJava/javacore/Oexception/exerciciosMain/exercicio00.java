package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;
import pedro.ProjetoJava.javacore.Oexception.dominios0.MemoriaInsuficienteError;
import  pedro.ProjetoJava.javacore.Oexception.dominios0.MemoriaSimulada;
import pedro.ProjetoJava.javacore.Oexception.dominios0.TamanhoInvalidoException;
import pedro.ProjetoJava.javacore.Oexception.dominios1.IdadeInvalidaException;

public class exercicio00 {
    public static void main(String[] args) {
        MemoriaSimulada m = new MemoriaSimulada();
        int[] array = new int[10];

        try {
            m.metodoRecebeInteiro(array.length);
        } catch (TamanhoInvalidoException e) {
            System.out.println("Tamanho invalido");
        } catch (MemoriaInsuficienteError e) {
            System.out.println("memoria insuficiente");
        }

        System.out.println("programa deu certo");

        array = new int[1001];

        try {
            m.metodoRecebeInteiro(array.length);
        } catch (TamanhoInvalidoException | MemoriaInsuficienteError e) {
            e.printStackTrace();
        }

        System.out.println("programa deu certo");
    }


}
