package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class funcionario02 {
    private String nome;
    private String matricula;
    private double salario;
    protected static int totalFuncionarios;

    public funcionario02(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public double calcularBonus(double bonus) {
        return 0;
    }
    public double calcularBonus(double bonus, double porcentagem) {
        return 0;
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0 ){
            System.out.println("Salario negativo, proibido!");
            return;
        }
        this.salario = salario;
    }
}
