package pedro.ProjetoJava.javacore.Oexception.dominios0;

public class TamanhoInvalidoException extends Exception {
  public TamanhoInvalidoException(){
    super("Tamanho invalido exception");
  }

  public TamanhoInvalidoException(String msg){
    super(msg);
  }
}
