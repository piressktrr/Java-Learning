package pedro.ProjetoJava.javacore.ZZDoptional.dominios2;

public class Endereco {
    private String complemento;
    private String rua;
    private String num;

    public Endereco(String complemento, String rua, String num) {
        this.complemento = complemento;
        this.rua = rua;
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getRua() {
        return rua;
    }

    public String getNum() {
        return num;
    }
}
