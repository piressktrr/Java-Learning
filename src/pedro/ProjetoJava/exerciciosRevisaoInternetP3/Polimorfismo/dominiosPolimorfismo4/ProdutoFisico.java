package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo4;

public class ProdutoFisico extends Produto {
    private double pesoKg;
    private String dimensoesCm;

    public ProdutoFisico(String nome, double preco, int estoque, double pesoKg, String dimensoesCm) {
        super(nome, preco, estoque);
        this.pesoKg = pesoKg;
        this.dimensoesCm = dimensoesCm;
    }

    @Override
    public double calcularFrete() {
        return this.pesoKg * 2.5;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg < 0) {
            System.out.println("O peso deve ser maior que zero");
            return;
        }
        this.pesoKg = pesoKg;
    }

    public String getDimensoesCm() {
        return dimensoesCm;
    }

    public void setDimensoesCm(String dimensoesCm) {
        if (dimensoesCm == null || dimensoesCm.isBlank()) {
            System.out.println("Erros na dimensoes");
            return;
        }
        this.dimensoesCm = dimensoesCm;
    }
}
