package pedro.ProjetoJava.exerciciosRevisaoInternetP2;

import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.desenvolvedor02;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.estagiario02;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.gerente02;

public class exerciciosP202 {
    public static void main(String[] args) {
        gerente02 Gerente = new gerente02("pedrokintar", "dev senior", 12000);
        desenvolvedor02 Desenvolvedor = new desenvolvedor02("criador do linux", "junior", 4000);
        estagiario02 Estagiario = new estagiario02("guanabara", "estagio", 2000);
        double bonusGerente = Gerente.calcularBonus(1500, 0.55);
        double bonusDesenvolvedor = Desenvolvedor.calcularBonus(750);
        double bonusEstagiario = Estagiario.calcularBonus(2000);


        System.out.println(Gerente.getNome());
        System.out.println(Gerente.getSalario());

        System.out.println();
        System.out.println(Desenvolvedor.getNome());
        System.out.println(Desenvolvedor.getSalario());


        System.out.println();
        System.out.println(Estagiario.getNome());
        System.out.println(Estagiario.getSalario());

        System.out.println("------------------");
        System.out.println( Gerente.getNome() +": "+  bonusGerente);
        System.out.println( Desenvolvedor.getNome() +": "+ bonusDesenvolvedor);
        System.out.println( Estagiario.getNome() +": "+ bonusEstagiario);


    }
}
