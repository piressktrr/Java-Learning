package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces4;

public class NotificacaoPush implements Notificavel{
    private String dispositivoId;

    public NotificacaoPush(String dispositivoId) {
        this.dispositivoId = dispositivoId;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println(mensagem);
        System.out.println("Verifique as notificações do seu dispositivo: " + dispositivoId + " há novidades");
        System.out.println();
    }

    @Override
    public String getTipoNotificacao() {
        return "Dispositivo";
    }

    public String getDispositivoId() {
        return dispositivoId;
    }

    public void setDispositivoId(String dispositivoId) {
        if (dispositivoId == null || dispositivoId.isBlank()) {
            System.out.println("dispostivo nulo");
            return;
        }
        this.dispositivoId = dispositivoId;
    }
}
