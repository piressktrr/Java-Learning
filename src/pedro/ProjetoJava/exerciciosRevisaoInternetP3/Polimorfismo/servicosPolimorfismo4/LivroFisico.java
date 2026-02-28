package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo4;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo4.ProdutoFisico;

public class LivroFisico extends ProdutoFisico {
    public LivroFisico(String nome, double preco, int estoque, double pesoKg, String dimensoesCm) {
        super(nome, preco, estoque, pesoKg, dimensoesCm);
    }

    @Override
    public double calcularFrete() {
        return 8;
    }
}
