package pedro.ProjetoJava.javacore.ZZHdesignpatterns.tests;

import pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios.Currency;
import pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios.CurrencyFactory;

public class FactoryTest01 {
    public static void main(String[] args) {
        Currency c = CurrencyFactory.newCurrency("Brazil");
        System.out.println(c.getSymbol());
    }
}
