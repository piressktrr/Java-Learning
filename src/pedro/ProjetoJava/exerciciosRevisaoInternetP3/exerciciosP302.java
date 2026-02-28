package pedro.ProjetoJava.exerciciosRevisaoInternetP3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios.funcionario02;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios.empresa02;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios.funcionarioCLT02;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios.funcionarioPJ02;

public class exerciciosP302 {
    public static void main(String[] args) {
        funcionarioCLT02 clt = new funcionarioCLT02("Pedro", 4000);
        funcionarioPJ02 pj = new funcionarioPJ02("Joao", 7000);
        funcionarioCLT02 clt2 = new funcionarioCLT02("matheus", 4000);
        funcionarioPJ02 pj2 = new funcionarioPJ02("Gabriel", 9000);
        funcionarioCLT02 clt3 = new funcionarioCLT02("Guilherme", 2000);
        empresa02 empresa = new empresa02("ITAU");

        clt.setBeneficios(1000);
        pj.setTaxaDesconto(30);

        empresa.adicionarFuncionarios(clt, 0);
        empresa.adicionarFuncionarios(pj, 1);
        empresa.adicionarFuncionarios(clt2, 2);
        empresa.adicionarFuncionarios(pj2, 3);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        empresa.verFuncionarios();
        int totalFuncionarios = funcionario02.getTotalFuncionarios();


        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Total de funcionários cadastrados: "+totalFuncionarios);

    }
}
