package pedro.ProjetoJava.miniProjetoRPG.controllerr;

import pedro.ProjetoJava.miniProjetoRPG.modelRpg.Classe;

public class Arqueiro extends Personagem {
    private int flechas;
    public Arqueiro(String nome, int vida, int ataque, int defesa, Classe classe, int flechas) {
        super(nome, vida, ataque, defesa, classe);
        this.flechas = flechas;
    }

    @Override
    public String habilidadeEspecial() {
        return "O arqueiro saca uma flecha mágica, a carrega e a atira.";
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        if (flechas < 0) {
            System.out.println("o número de flechas é menor que 0, faça novamente");
            this.flechas = 0;
            return;
        }


        this.flechas = flechas;
    }
}
