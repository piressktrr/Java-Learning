package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class produto05 {
    private String codigo;
    private String nome;
    private double preco;

    public produto05(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoFinal(){
       return 0;
    }

    public double aplicarDesconto(double desconto){
        return 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
