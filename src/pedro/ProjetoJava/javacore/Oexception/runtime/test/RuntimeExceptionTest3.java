package pedro.ProjetoJava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest3 {
    public static void main(String[] args) {
        System.out.println(abrirConexao());
    }

    public static String abrirConexao() {
        try {
            System.out.println("Abrir Conexao");
            throw new Exception("erro em abrir Conexao");

        } catch (Exception e) {
            System.out.println("Erro ao abrir Conexao");
            e.printStackTrace();
        } finally {
            System.out.println("Fechando Conexao");
        }
        return null;
    }

}
