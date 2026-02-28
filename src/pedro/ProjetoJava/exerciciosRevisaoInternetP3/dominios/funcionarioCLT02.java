package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class funcionarioCLT02 extends funcionario02{
    private double beneficios;
    public funcionarioCLT02(String nome, double salarioBase) {
        super(nome, salarioBase);

    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + beneficios;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        if (beneficios < 0){
            System.out.println("Erro: Valor dos beneficios invalido");
            return;
        }
        this.beneficios = beneficios;
    }
}
