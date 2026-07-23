package pedro.ProjetoJava.javacore.ZZHdesignpatterns.tests;

import pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios.AirCraftSingletonLazy;

public class SingletonLazyTest01 {
    public static void main(String[] args) {

        assento("1A");
        assento("1A");
    }

    private static void assento(String assento){
        AirCraftSingletonLazy airCraftSingletonLazy = AirCraftSingletonLazy.getAirCraftSingletonLazy();
        System.out.println(airCraftSingletonLazy);
        System.out.println(airCraftSingletonLazy.assento(assento));
    }
}
