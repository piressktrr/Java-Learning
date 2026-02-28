package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public  class guerreiro04 extends personagem04 {
    private int armadura;
    public guerreiro04(String nome, int vida, int ataque, int defesa, classePersonagem classe, int armadura) {
        super(nome, vida, ataque, defesa, classe);
        this.armadura = armadura;
    }

    @Override
    public String habilidadeEspecial() {
        return "O Guerreiro dá um giro em 360 graus com sua espada.";
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        if (armadura < 0) {
            return;
        }
        this.armadura = armadura;
    }
}
