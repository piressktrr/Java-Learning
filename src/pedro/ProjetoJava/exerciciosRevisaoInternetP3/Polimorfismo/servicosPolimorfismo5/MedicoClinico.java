package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo5;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Medico;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Prescricivel;

public class MedicoClinico extends Medico implements Prescricivel {
    private String[] medicamentos = new String[5];
    public MedicoClinico(String nome, String crm, String especialidade, int plantoes) {
        super(nome, crm, especialidade, plantoes);
    }

    @Override
    public void registrarPlantoes() {
        super.registrarPlantoes();
    }

    @Override
    public void realizarAtendimento(String paciente) {
        System.out.println("Realizando atendimento do paciente de nome: " + paciente);
    }

    @Override
    public void prescreverMedicamento(String medicamento) {

        for (int i = 0; i < 1; i++) {
            if (medicamentos[i] != null) {
                medicamentos[i] = medicamento;
            }
        }

    }

    @Override
    public String[] getPrescricoes() {
        return this.medicamentos;
    }
}
