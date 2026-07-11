package pedro.ProjetoJava.javacore.ZZDoptional.dominios3;

public class Pedido {
    private Integer numero;
    private Double valor;
    private Status status;



    public Pedido(Integer numero, Double valor, Status status) {
        this.numero = numero;
        this.valor = valor;
        this.status = status;
    }

    public Pedido() {

    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", valor=" + valor +
                ", status=" + status +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getValor() {
        return valor;
    }

    public Status getStatus() {
        return status;
    }
}
