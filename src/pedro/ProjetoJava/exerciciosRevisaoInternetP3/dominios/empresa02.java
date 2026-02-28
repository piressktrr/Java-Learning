package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class empresa02 {
    private String nome;
    private funcionario02[] funcionarios = new funcionario02[5];
    public empresa02(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionarios(funcionario02 f, int posicao) {
        if (posicao < 0 || posicao >= funcionarios.length) {
            System.out.println("Erro, posicao colocada maior que o numero de funcionarios ou menor que 0");

            return;
        } else if (funcionarios[posicao] != null) {
            System.out.println("Erro, a posicao atual ja esta ocupada");

            return;
        }
        funcionarios[posicao] = f;
        funcionario02.setTotalFuncionarios(1);

    }

    public void verFuncionarios() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                System.out.println("Nome: "+funcionarios[i].getNome() + " | Salário: R$" + funcionarios[i].calcularSalario());
            }
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            return;
        }
        this.nome = nome;
    }

    public funcionario02[] getFuncionarios() {
        return funcionarios;
    }
}
