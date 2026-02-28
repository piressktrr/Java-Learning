package pedro.ProjetoJava.exerciciosRevisaoIntensivo;

public class exercicio05Intensivo {
    public static void main(String[] args) {
        int cont = 0;
        for (int x = 3; x <= 100; x++) {
            cont++;
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
        }
    }
}
