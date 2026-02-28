package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class arqueiro04 extends personagem04{
    private int flechas;
    public arqueiro04(String nome, int vida, int ataque, int defesa, classePersonagem classe) {
        super(nome, vida, ataque, defesa, classe);
    }

    @Override
    public String habilidadeEspecial() {
        return "O arqueiro saca uma flecha mágica, a carrega e a atira.";
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        if (flechas < 0)
            return;
        this.flechas = flechas;
    }
}
