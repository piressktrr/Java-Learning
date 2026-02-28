package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces4;

public class NotificacaoEmail implements Notificavel {
    private String email;

    public NotificacaoEmail(String email) {
        this.email = email;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println(mensagem);
        System.out.println("Verifique seu email "+this.email+" há novidades!");
        System.out.println();
    }

    @Override
    public String getTipoNotificacao() {
        return "Email";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()){
            System.out.println("email nulo ou vazio");
            return;
        }
        this.email = email;
    }
}
