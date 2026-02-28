package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo4.Desconto;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo4.Produto;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo4.Eletronico;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo4.LivroDigital;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo4.LivroFisico;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo4.Roupa;

public class exercicioP311 {
    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico("Celular", 3000, 10, 1, "16x32");
        Roupa roupa = new Roupa("MAISON MARGIELA", 2000, 5, 0.500, "70x80");
        LivroFisico livroFisico = new LivroFisico("A MORTE DE IVAN ILITCH", 30, 100, 0.300,
                "15x15");
        LivroDigital livroDigital = new LivroDigital("fanfic aleatoria", 5, 1000);

        Produto[] produto = new Produto[]{eletronico, roupa, livroFisico, livroDigital};

        for (Produto produto1 : produto) {
            if(produto1 != null) {
                if (produto1 instanceof Desconto desconto) {
                    System.out.println("Produto com desconto aplicado: R$" + desconto.aplicarDesconto(100));
                }
                produto1.exibirProduto();

            }
        }



    }
}
