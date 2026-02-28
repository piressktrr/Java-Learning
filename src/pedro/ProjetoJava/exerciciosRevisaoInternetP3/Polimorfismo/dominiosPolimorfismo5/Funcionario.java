package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5;

public abstract class Funcionario {
    private String nome;
    private String crm;
    private String especialidade;

    public Funcionario(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public abstract void realizarAtendimento(String paciente);

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CRM: " + this.crm);
        System.out.println("Especialidade: " + this.especialidade);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null && !nome.isEmpty()) {
            System.out.println("Erro no nome!!");
            return;
        }
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if (crm == null && !crm.isEmpty()) {
            System.out.println("Erro no crm!!");
            return;
        }
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null && !especialidade.isEmpty()) {
            System.out.println("Erro no especialidade!!");
            return;
        }
        this.especialidade = especialidade;
    }
}
