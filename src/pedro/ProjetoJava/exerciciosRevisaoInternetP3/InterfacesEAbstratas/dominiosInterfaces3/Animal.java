package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces3;

import java.util.Locale;

public abstract class Animal {
    private String nome;
    private int idade;
    private String habitat;

    public Animal(String nome, int idade, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public abstract void emitirSom();
    public void exibirFicha(){
        System.out.println("Nome: " + this.nome.toUpperCase(Locale.ROOT));
        System.out.println("Idade: " + this.idade);
        System.out.println("Habitat: " + this.habitat);


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            System.out.println("erro, nome nulo!");
            return;
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("erro, idade nulo!");
            this.idade = 0;
            return;
        }
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isBlank()){
            System.out.println("erro, habitat nulo!");
            return;
        }
        this.habitat = habitat;
    }
}
