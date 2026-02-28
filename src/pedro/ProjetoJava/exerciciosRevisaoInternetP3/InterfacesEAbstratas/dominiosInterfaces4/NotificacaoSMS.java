package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces4;

public class NotificacaoSMS implements Notificavel {
    private String telefone;

    public NotificacaoSMS(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println(mensagem);
        System.out.println("Verifique o sms do seu telefone: " + this.telefone +", há novidades.");
        System.out.println();
    }

    @Override
    public String getTipoNotificacao() {
        return "SMS";
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.length() != 11) {
            System.out.println("erro, tamanho errado de telefone");
            return;
        }
        this.telefone = telefone;
    }
}
