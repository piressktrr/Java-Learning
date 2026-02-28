package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Cirurgico;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Funcionario;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Medico;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Prescricivel;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo5.Enfermeiro;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo5.MedicoCirurgiao;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo5.MedicoClinico;

public class exercicioP312 {
    public static void main(String[] args) {
        MedicoClinico medicoClinico = new MedicoClinico("Matheus", "1324141415", "Clinico",
                5);

        MedicoCirurgiao medicoCirurgiao = new MedicoCirurgiao("Pedro", "142556667", "Cirurgiao",
                4);

        Enfermeiro enfermeiro = new Enfermeiro("Gabriel", "1425667889", "Enfermeiro");

        Funcionario[] funcionarios = new Funcionario[]{medicoClinico, medicoCirurgiao, enfermeiro};

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                funcionario.exibirDados();

                funcionario.realizarAtendimento("Guilherme");
                if (funcionario instanceof Cirurgico cirurgico) {
                    cirurgico.realizarCirurgia("Coração");
                    System.out.println("Total de cirurgias do " + funcionario.getNome() + ": " +
                            cirurgico.getTotalCirurgias());
                }
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }

        }
    }
}
