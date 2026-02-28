package pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios;

public class funcionario010Intensivo {
    public String nome;
    public int idade;
    public double [] salario;

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.salario != null) {
            System.out.println("Salario: R$" + this.salario[0]);
        }
    }

    public double mediaSalario() {
        double soma = 0;
        if (this.salario != null) {
            for (int i = 0; i < salario.length; i++) {
                soma += salario[i];
            }

            return soma / salario.length;
        }
        return 0;
    }
}
