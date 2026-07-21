package pedro.ProjetoJava.javacore.ZZGconcorrencia.dominios;

public class Quote {
    private String nome;
    private double price;
    private Discount.Code discount;

    private Quote(String nome, double price, Discount.Code discount) {
        this.nome = nome;
        this.price = price;
        this.discount = discount;
    }

    public static Quote newQuote(String val) {
        String[] values = val.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }

    public Discount.Code getDiscount() {
        return discount;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }
}
