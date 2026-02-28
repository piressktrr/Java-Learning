package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo5;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Funcionario;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Prescricivel;

public class Enfermeiro extends Funcionario implements Prescricivel {
    private String[] medicamentos = new String[5];
    public Enfermeiro(String nome, String crm, String especialidade) {
        super(nome, crm, especialidade);
    }

    @Override
    public void realizarAtendimento(String paciente) {
        System.out.println("Enfermeiro realizando atendimento do paciente " + paciente);
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
