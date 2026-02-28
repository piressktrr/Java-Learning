package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class item04 {
    private String nomeItem;
    private int bonus;
    private String tipo;

    public item04(String nomeItem, int bonus, String tipo) {
        this.nomeItem = nomeItem;
        this.bonus = bonus;
        this.tipo = tipo;
    }



    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
