package pedro.ProjetoJava.miniProjetoRPG.modelRpg;


import pedro.ProjetoJava.miniProjetoRPG.controllerr.Personagem;

public class Batalha {
    public static void iniciar(Personagem p1, Personagem p2) {
        int vidaP1 = p1.getVida() + p1.getDefesa();
        int vidaP2 = p2.getVida() + p2.getDefesa();
        System.out.println("Vida inicial do " + p1.getNome() + ": " + vidaP1);
        System.out.println("Vida inicial do " + p2.getNome() + ": " + vidaP2);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        while (true) {
            vidaP1 -= p2.calcularAtaqueFinal();
            vidaP2 -= p1.calcularAtaqueFinal();
            if (vidaP1 <= 0){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("o vencedor foi o: " +p2.getNome()+ ", sua vida restante foi: " + vidaP2);
                break;
            } else if (vidaP2 <= 0){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("o vencedor foi o: " +p1.getNome()+ ", sua vida restante foi: " +vidaP1);
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
