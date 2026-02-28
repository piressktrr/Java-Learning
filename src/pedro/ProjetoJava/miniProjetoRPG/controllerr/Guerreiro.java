package pedro.ProjetoJava.miniProjetoRPG.controllerr;


import pedro.ProjetoJava.miniProjetoRPG.modelRpg.Classe;

public class Guerreiro extends Personagem {
    private int armadura;
    public Guerreiro(String nome, int vida, int ataque, int defesa, Classe classe, int armadura) {
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
            System.out.println("a armadura é menor que 0, faça novamente");
            this.armadura = 0;
            return;
        }
        this.armadura = armadura;
    }
}
