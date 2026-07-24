package pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios;

import java.util.HashSet;
import java.util.Set;

public enum AirCraftSingletonEnum {
    INSTANCE,
    ;
    private final Set<String> seats;

    AirCraftSingletonEnum() {
        this.seats = new HashSet<String>();
        this.seats.add("A");
        this.seats.add("B");
    }

    public boolean bookSeat(String seat) {
        return this.seats.remove(seat);
    }
}
