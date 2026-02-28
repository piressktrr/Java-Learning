package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class mago04 extends personagem04{
    private int mana;
    public mago04(String nome, int vida, int ataque, int defesa, classePersonagem classe, int mana) {
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
        if (mana < 0)
            return;
        this.mana = mana;
    }
}
