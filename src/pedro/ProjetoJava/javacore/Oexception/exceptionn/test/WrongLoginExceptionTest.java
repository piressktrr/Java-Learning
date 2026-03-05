package pedro.ProjetoJava.javacore.Oexception.exceptionn.test;

public class WrongLoginExceptionTest extends Exception {
    public WrongLoginExceptionTest() {
        super("Login or password incorrect.");
    }

    public WrongLoginExceptionTest(String message) {
        super(message);
    }
}
