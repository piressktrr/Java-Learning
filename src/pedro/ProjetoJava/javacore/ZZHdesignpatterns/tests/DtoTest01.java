package pedro.ProjetoJava.javacore.ZZHdesignpatterns.tests;

import pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios.*;

public class DtoTest01 {
    public static void main(String[] args) {
        Pessoa pedro = Pessoa.Builder.newPessoa()
                .setNome("a")
                .build();

        Currency currency = CurrencyFactory.newCurrency("Brazil");
        AirCraftSingletonEager airCraftSingletonEager = AirCraftSingletonEager.getAirCraftSingletonEager();

        ReportDTO dto = ReportDTO.Builder.newReportDTO()
                .setAirCraftSingletonEager(airCraftSingletonEager)
                .setCurrency(currency)
                .setPessoa(pedro)
                .build();
    }
}
