package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class batalha04 {

    public static void iniciar(personagem04 p1, personagem04 p2) {
        int vidaP1 = p1.getVida();
        int vidaP2 = p2.getVida();
        while (true) {
            vidaP1 -= p2.getAtaque();
            vidaP2 -= p1.getAtaque();
            if (vidaP1 <= 0){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("o vencedor foi o: " +p2.getNome());
                break;
            } else if (vidaP2 <= 0){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("o vencedor foi o: " +p1.getNome());
                break;
            }



            System.out.println("vida do "+p1.getNome().toUpperCase()+" com o dano do "+p2.getNome().toUpperCase()+": "
                    + vidaP1);
            System.out.println("vida do "+p2.getNome().toUpperCase()+" com o dano do "+p1.getNome().toUpperCase()+": "
                    + vidaP2);
            System.out.println();



        }


    }
}
