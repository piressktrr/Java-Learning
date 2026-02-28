package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo5;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Cirurgico;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Medico;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Prescricivel;

public class MedicoCirurgiao extends Medico implements Prescricivel, Cirurgico {
    private int cirurgias;
    public MedicoCirurgiao(String nome, String crm, String especialidade, int plantoes) {
        super(nome, crm, especialidade, plantoes);
    }

    @Override
    public void registrarPlantoes() {
        super.registrarPlantoes();
    }

    @Override
    public void realizarAtendimento(String paciente) {
        System.out.println("Realizando o atendimento cirúrgico do paciente: " + paciente);
    }

    @Override
    public void prescreverMedicamento(String medicamento) {
        System.out.println("Prescrevendo medicamentos.., são eles: " + medicamento);

    }

    @Override
    public String[] getPrescricoes() {
        return new String[0];
    }


    @Override
    public void realizarCirurgia(String tipo) {
        System.out.println("Realizando cirurgia complexa do tipo: " + tipo);
        this.cirurgias++;
    }

    @Override
    public int getTotalCirurgias() {
        return this.cirurgias;
    }
}
