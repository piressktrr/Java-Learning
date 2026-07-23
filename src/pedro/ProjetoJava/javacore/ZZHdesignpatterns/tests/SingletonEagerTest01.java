package pedro.ProjetoJava.javacore.ZZHdesignpatterns.tests;

import pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios.AirCraftSingletonEager;

public class SingletonEagerTest01 {
    public static void main(String[] args) {
        AirCraftSingletonEager airCraftSingletonEager = AirCraftSingletonEager.getAirCraftSingletonEager();
        System.out.println(airCraftSingletonEager);
        assento("1A");
        assento("1A");
    }

    private static void assento(String assento){
        AirCraftSingletonEager airCraftSingletonEager = AirCraftSingletonEager.getAirCraftSingletonEager();
        System.out.println(airCraftSingletonEager);
        System.out.println(airCraftSingletonEager.assento(assento));
    }
}
