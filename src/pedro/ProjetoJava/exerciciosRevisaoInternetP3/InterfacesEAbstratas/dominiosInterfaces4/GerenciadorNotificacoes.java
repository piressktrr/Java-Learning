package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces4;

public class GerenciadorNotificacoes {
    private final Notificavel[] notificavels = new Notificavel[6];

    public void adicionarCanal(Notificavel n, int posicao){
        if (n != null || posicao < 0 || posicao >= notificavels.length) {
                notificavels[posicao] = n;

        }

    }

    public void notificarTodos(String mensagem){
        for (int i = 0; i < notificavels.length; i++) {
            if (notificavels[i] != null) {
                notificavels[i].enviarNotificacao(mensagem);
            }
        }
    }

    public void listarCanais(){
        System.out.println("Tipos de notificações enviadas: ");
        for (Notificavel notificavel : notificavels) {
            if (notificavel != null) {
                System.out.print(notificavel.getTipoNotificacao() + ", ");

            }
        }
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public Notificavel[] getNotificavels() {
        return notificavels;
    }
}
