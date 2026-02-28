package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces.Transacao;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.ContaBancaria;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.Tributavel;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo3.ContaCorrente;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo3.ContaInvestimento;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo3.ContaPoupanca;

public class exercicioP10 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Pedro", "1332141", 3000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("mateus", "14567141", 5000);
        ContaInvestimento contaInvestimento = new ContaInvestimento("gabriel", "1324455567",
                8000, 400);




        ContaBancaria[] contas = new ContaBancaria[]{contaCorrente, contaPoupanca, contaInvestimento};

        for (ContaBancaria conta : contas) {
            if (conta != null) {
                conta.exibirExtrato();
                if (conta instanceof Tributavel tributavel) {
                    System.out.println("Imposto da conta de "+conta.getTitular()+ ": R$" + +tributavel.calcularImposto()+
                            " - Pois ela é tributavel e " +tributavel.getTipoAtributo());
                }
                if (conta instanceof ContaPoupanca) {
                    System.out.println("Rendimento mensal da conta poupança com taxa: R$" +
                            " " + ((ContaPoupanca) conta).rendimentoMensal(200));
                }
                if (conta instanceof ContaInvestimento) {
                    System.out.println("Taxa de rendimento da conta investimento aplicada: R$" +
                            ((ContaInvestimento) conta).aplicar(100));
                }
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }
    }
}
