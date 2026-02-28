package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5;

public abstract class Medico extends Funcionario {
    private int plantoes;

    public Medico(String nome, String crm, String especialidade, int plantoes) {
        super(nome, crm, especialidade);
        this.plantoes = plantoes;
    }

    public void registrarPlantoes(){
        this.plantoes++;
    }

    public int getPlantoes() {
        return plantoes;
    }

    public void setPlantoes(int plantoes) {
        if (plantoes < 0) {
            System.out.println("Erro!");
            return;
        }
        this.plantoes = plantoes;
    }
}
