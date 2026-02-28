package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public abstract  class funcionario02 {
    protected String nome;
    protected double salarioBase;
    private static int totalFuncionarios;

    public funcionario02(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Erro: Nome nulo");
            return;
        }
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            this.salarioBase = 0;
            System.out.println("Erro: Salario base negativo");
            return;
        }
        this.salarioBase = salarioBase;
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public static void setTotalFuncionarios(int totalFuncionarios) {
        funcionario02.totalFuncionarios += totalFuncionarios;
    }
}
