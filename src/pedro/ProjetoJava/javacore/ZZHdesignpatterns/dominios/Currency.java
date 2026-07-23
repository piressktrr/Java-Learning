package pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios;

public interface Currency {

    public String getSymbol();


}

class usDollar implements  Currency{
    @Override
    public String getSymbol() {
        return "DOLLAR";
    }
}


class Real implements Currency{
    @Override
    public String getSymbol() {
        return "REAL";
    }
}