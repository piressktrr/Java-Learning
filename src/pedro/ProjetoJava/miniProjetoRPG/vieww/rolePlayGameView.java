package pedro.ProjetoJava.miniProjetoRPG.vieww;


import pedro.ProjetoJava.miniProjetoRPG.controllerr.Arqueiro;
import pedro.ProjetoJava.miniProjetoRPG.modelRpg.Classe;
import pedro.ProjetoJava.miniProjetoRPG.modelRpg.Batalha;

import pedro.ProjetoJava.miniProjetoRPG.controllerr.Item;
import pedro.ProjetoJava.miniProjetoRPG.controllerr.Guerreiro;
import pedro.ProjetoJava.miniProjetoRPG.controllerr.Mago;

public class rolePlayGameView {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Barbaro", 1200, 100, 120,
                Classe.GUERREIRO, 60);

        Mago mago = new Mago("Bob", 600, 250, 60, Classe.MAGO, 120);
        Arqueiro arqueiro = new Arqueiro("Arqueiro verde", 800, 100, 10, Classe.ARQUEIRO,
                40);

        // itens pro guerreiro
        Item espada = new Item("espada", 100, "ataque");
        Item porrete = new Item("porrete", 50, "porte");
        Item lanca = new Item("lanca", 120, "lanca");

        // itens pro mago
        Item cajado = new Item("cajado", 0, "ataque");
        Item chapeu = new Item("chapeu", 0, "defesa");
        Item amuleto = new Item("amuleto", 30, "ataque");


        // itens pro arqueiro
        Item arco = new Item("arco", 200, "ataque");
        Item capuz = new Item("capuz", 0, "defesa");
        Item pedraDeFogo = new Item("pedraDeFogo", 10, "ataque");

        guerreiro.equiparItem(espada, porrete, lanca);
        mago.equiparItem(cajado, chapeu, amuleto);
        arqueiro.equiparItem(arco, capuz, pedraDeFogo);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(guerreiro);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for (Item item1 : guerreiro.getItems()) {
            if (item1 != null) {
                System.out.println("Itens do Guerreiro: " + item1.getNomeItem() + ", Bonus: " + item1.getBonus() +
                        ", " + item1.getTipo());
            }
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Habilidade especial do guerreiro: " + guerreiro.habilidadeEspecial());
        int guerreiroAtaqueFinal = guerreiro.calcularAtaqueFinal();
        System.out.println("Dano do seu ataque final: " + guerreiroAtaqueFinal);
        System.out.println();


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(mago);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for (Item item1 : mago.getItems()) {
            if (item1 != null) {
                System.out.println("Itens do mago: " + item1.getNomeItem() + ", Bonus: " + item1.getBonus() +
                        ", " + item1.getTipo());
            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Habilidade especial do mago: " + mago.habilidadeEspecial());
        int magoAtaqueFinal = mago.calcularAtaqueFinal();
        System.out.println("Dano do seu ataque final: " + magoAtaqueFinal);
        System.out.println();


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(arqueiro);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (Item item1 : arqueiro.getItems()) {
            if (item1 != null) {
                System.out.println("Itens do arqueiro: " + item1.getNomeItem() + ", Bonus: " + item1.getBonus() +
                        ", " + item1.getTipo());
            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Habilidade especial do arqueiro: " + arqueiro.habilidadeEspecial());
        int arqueiroAtaqueFinal = arqueiro.calcularAtaqueFinal();
        System.out.println("Dano do seu ataque final: " + arqueiroAtaqueFinal);
        System.out.println();


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Iniciando Batalha!!!!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Batalha.iniciar(guerreiro, mago);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }
}
