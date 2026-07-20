package pedro.ProjetoJava.javacore.ZZFthreads;

import pedro.ProjetoJava.javacore.ZZFthreads.dominios.EmailDeliveryService;
import pedro.ProjetoJava.javacore.ZZFthreads.dominios.Members;

import javax.swing.*;

public class ThreadsTest04 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread  t1 = new Thread(new EmailDeliveryService(members), "pedro");
        Thread  t2 = new Thread(new EmailDeliveryService(members), "maria");

        t1.start();
        t2.start();

        while (true) {
            String e = JOptionPane.showInputDialog("Informe o seu email: ");
            if (e == null || e.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(e);
        }
    }


}
