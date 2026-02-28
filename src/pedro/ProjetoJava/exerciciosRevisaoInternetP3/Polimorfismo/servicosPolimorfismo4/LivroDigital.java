package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo4;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo4.Desconto;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo4.Produto;

public class LivroDigital extends Produto implements Desconto {
    public LivroDigital(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }

    @Override
    public double calcularFrete() {
        return 0;
    }

    @Override
    public double aplicarDesconto(double valor) {
        return 0.20 * valor;
    }

    @Override
    public String getTipoDesconto() {
        return "Desconto digital";
    }
}
