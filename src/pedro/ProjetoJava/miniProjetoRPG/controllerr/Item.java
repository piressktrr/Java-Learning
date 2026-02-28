package pedro.ProjetoJava.miniProjetoRPG.controllerr;

public class Item {
    private String nomeItem;
    private int bonus;
    private String tipo;

    public Item(String nomeItem, int bonus) {
        this.nomeItem = nomeItem;
        this.bonus = bonus;
        this.tipo = "ataque";
    }

    public Item(String nomeItem, int bonus, String tipo) {
        this.nomeItem = nomeItem;
        this.bonus = bonus;
        this.tipo = tipo;
    }


    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        if (nomeItem == null) {
            System.out.println("o nome do item está nulo, faça novamente");
            return;
        }
        this.nomeItem = nomeItem;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus <= 0) {
            System.out.println("o bonus esta igual ou menor que 0 , faça novamente");
            this.bonus = 0;
            return;
        }
        this.bonus = bonus;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null) {
            System.out.println("o tipo esta nulo, faça novamente");
            return;
        }
        this.tipo = tipo;
    }

}
