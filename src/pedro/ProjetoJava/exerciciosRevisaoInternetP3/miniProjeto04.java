package pedro.ProjetoJava.exerciciosRevisaoInternetP3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios.*;

public class miniProjeto04 {
    public static void main(String[] args) {
        guerreiro04 guerreiro = new guerreiro04("Barbaro", 1200, 100, 120,
                classePersonagem.GUERREIRO , 60);

        mago04 mago = new mago04("Bob", 600, 250, 60, classePersonagem.MAGO , 120);

        item04 espada = new item04("espada", 100, "ataque");
        item04 cajado = new item04("cajado", 0, "ataque");

        guerreiro.equiparItem(espada);
        mago.equiparItem(cajado);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(guerreiro);
        for (item04 item : guerreiro.getItems()) {
            if (item != null) {
                System.out.println(item.getNomeItem()+ ", " + item.getBonus() + ", " + item.getTipo());
            }
        }

        System.out.println(guerreiro.habilidadeEspecial());
        guerreiro.calcularAtaqueFinal();

        System.out.println();

        System.out.println(mago);
        for (item04 item : mago.getItems()) {
            if (item != null) {
                System.out.println(item.getNomeItem()+ ", " + item.getBonus() + ", " + item.getTipo());
            }
        }

        System.out.println(mago.habilidadeEspecial());
        mago.calcularAtaqueFinal();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Iniciando Batalha!!!!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        batalha04.iniciar(guerreiro, mago);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
