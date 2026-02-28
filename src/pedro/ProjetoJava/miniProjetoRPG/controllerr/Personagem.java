package pedro.ProjetoJava.miniProjetoRPG.controllerr;


import pedro.ProjetoJava.miniProjetoRPG.modelRpg.Classe;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private Classe classe;
    private Item[] items = new Item[3];

    public Personagem(String nome, int vida, int ataque, int defesa, Classe classe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.classe = classe;

    }

    public abstract String habilidadeEspecial();

    public int calcularAtaqueFinal(){
        int local = 0;
        for (Item item1 : items) {
            if (item1 != null && item1.getTipo().equals("ataque")) {
                local += item1.getBonus();
            }
        }
        return local;
    }

    public void equiparItem(Item... itemsEquipar) {
        for (int i = 0; i < itemsEquipar.length; i++) {
            items[i] = itemsEquipar[i];

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null){
            System.out.println("Nome é nulo, try again");
            return;
        }
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0){
            this.vida = 0;
            return;
        }
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque < 0){
            this.ataque = 0;
            return;
        }
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        if (defesa < 0){
            this.defesa = 0;
            return;
        }
        this.defesa = defesa;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        if (classe == null){
            System.out.println("Classe <UNK> nulo, try again");
            return;
        }
        this.classe = classe;
    }

    public Item[] getItems() {
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
