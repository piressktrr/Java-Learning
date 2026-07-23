package pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios;

public class CurrencyFactory {
    public static Currency newCurrency(String pais){
        return switch (pais) {
            case "Brazil" -> new Real();
            case "Usa" -> new usDollar();
            default -> throw new IllegalArgumentException("so testando");
        };
    }
}
