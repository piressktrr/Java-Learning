package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

import java.util.Arrays;

public abstract class personagem04 {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private classePersonagem classe;
    private item04[] items = new item04[3];

    public personagem04(String nome, int vida, int ataque, int defesa, classePersonagem classe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.classe = classe;
        this.vida += this.defesa;
    }

    public abstract String habilidadeEspecial();

    public void calcularAtaqueFinal(){

        for (item04 item : items) {
            if (item != null && item.getTipo().equals("ataque")) {
                this.ataque += item.getBonus();
            }
        }

    }

    public void equiparItem(item04... itemsEquipar) {
        for (int i = 0; i < itemsEquipar.length; i++) {
            items[i] = itemsEquipar[i];
            if (itemsEquipar.length == items.length) {
                System.out.println("limite de itens atingidos");
                break;
            }
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null){
            return;
        }
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0){
            return;
        }
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque < 0){
            return;
        }
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        if (defesa < 0){
            return;
        }
        this.defesa = defesa;
    }

    public classePersonagem getClasse() {
        return classe;
    }

    public void setClasse(classePersonagem classe) {
        this.classe = classe;
    }

    public item04[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "personagem04{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defesa=" + defesa +
                ", classe=" + classe +
                '}';
    }
}
