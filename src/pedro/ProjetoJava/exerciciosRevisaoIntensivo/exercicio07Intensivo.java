package pedro.ProjetoJava.exerciciosRevisaoIntensivo;

public class exercicio07Intensivo {
    public static void main(String[] args) {
        int valorCarro = 40000;
        for (int i = 1; i < valorCarro; i++) {
            int valorParcela = valorCarro / i;
           if (valorParcela >= 1000){
               System.out.println("parcela: " + i + " valor: " + valorParcela);
           } else {
               break;
           }

        }
    }
}
