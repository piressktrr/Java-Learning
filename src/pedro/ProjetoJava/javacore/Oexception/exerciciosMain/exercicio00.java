package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;
import  pedro.ProjetoJava.javacore.Oexception.dominios0.MemoriaSimulada;

public class exercicio00 {
    public static void main(String[] args) {
        MemoriaSimulada m = new MemoriaSimulada();
        int[] array = new int[10];

        try {
            m.metodoRecebeInteiro(999);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("programa deu certo");

        int a = 15;
        int b = -7;
        int x = a + b;
        System.out.println(x);
    }


}
