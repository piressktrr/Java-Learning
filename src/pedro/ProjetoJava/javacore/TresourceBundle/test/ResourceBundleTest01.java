package pedro.ProjetoJava.javacore.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("pedro.resources.messages", Locale.of("pt", "BR"));
        System.out.println(bundle.getString("msg1"));
        System.out.println(bundle.getString("msg2"));
    }
}
