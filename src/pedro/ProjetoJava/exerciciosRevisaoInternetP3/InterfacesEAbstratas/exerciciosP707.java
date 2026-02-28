package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces4.*;

import java.util.Arrays;

public class exerciciosP707 {
    public static void main(String[] args) {
        NotificacaoEmail notificacaoEmail = new NotificacaoEmail("pedrolindo@gmail.com");
        NotificacaoSMS notificacaoSMS = new NotificacaoSMS("11 91111-1111");
        NotificacaoPush notificacaoPush = new NotificacaoPush("Samsung S25");
        GerenciadorNotificacoes gerenciadorNotificacoes = new GerenciadorNotificacoes();

        Notificavel[] notificavel = new Notificavel[]{notificacaoEmail, notificacaoSMS, notificacaoPush};
        for (int i = 0; i < notificavel.length; i++) {
            gerenciadorNotificacoes.adicionarCanal(notificavel[i], i);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        gerenciadorNotificacoes.notificarTodos("Sua compra foi confirmada!");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        gerenciadorNotificacoes.listarCanais();
        System.out.println();
        System.out.println("teste: ");
        System.out.println(((Notificavel) notificacaoEmail).getTipoNotificacao());
        System.out.println(((Notificavel) notificacaoSMS).getTipoNotificacao());
        System.out.println(((Notificavel) notificacaoPush).getTipoNotificacao());


    }
}
