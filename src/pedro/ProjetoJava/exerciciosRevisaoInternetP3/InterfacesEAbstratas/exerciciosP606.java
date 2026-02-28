package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas;


import pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces3.*;

public class exerciciosP606 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("thor", 5, "domestico", 15);
        Golfinho golfinho = new Golfinho("golfinho", 2, "selvagem", 15);
        Leao leao = new Leao("leao", 4, "selvagem - tanzania", 40);

        Animal[] animais = new Animal[]{cachorro, golfinho, leao};

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=");
        for (Animal animal : animais) {
            animal.exibirFicha();
            if (animal instanceof Mamifero mamifero) {
                System.out.println("Peso: " + mamifero.getPesoKg() + "KG");
                mamifero.amamentar();
            }
            animal.emitirSom();
            if (animal instanceof Adestravel a) {
                if (a.podeSerAdestravel()){
                    a.realizarTruque();
                    System.out.println("O "+animal.getNome() +" Pode ser adestrado: "+a.podeSerAdestravel());
                }
            }

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}
