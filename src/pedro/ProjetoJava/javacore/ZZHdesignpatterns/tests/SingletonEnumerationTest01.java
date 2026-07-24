package pedro.ProjetoJava.javacore.ZZHdesignpatterns.tests;

import pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios.AirCraftSingletonEnum;
import pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios.AirCraftSingletonLazy;

public class SingletonEnumerationTest01 {
    public static void main(String[] args) {
        assento("A");
        assento("A");
    }
    private static void assento(String assento){
        System.out.println(AirCraftSingletonEnum.INSTANCE);
        AirCraftSingletonEnum airCraftSingletonEnum = AirCraftSingletonEnum.INSTANCE;
        System.out.println(airCraftSingletonEnum.bookSeat(assento));
    }

}
