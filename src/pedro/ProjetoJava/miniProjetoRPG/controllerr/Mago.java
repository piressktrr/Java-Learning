package pedro.ProjetoJava.miniProjetoRPG.controllerr;

import pedro.ProjetoJava.miniProjetoRPG.modelRpg.Classe;

public class Mago extends Personagem {
    private int mana;
    public Mago(String nome, int vida, int ataque, int defesa, Classe classe, int mana) {
        super(nome, vida, ataque, defesa, classe);
        this.mana = mana;
    }

    @Override
    public String habilidadeEspecial() {
        return "O mago solta uma enorme bola de fogo!.";
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
            return;
        }

        this.mana = mana;
    }
}
