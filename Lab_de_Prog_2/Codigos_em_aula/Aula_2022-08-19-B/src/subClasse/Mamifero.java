package subClasse;

import superClasse.Animal;

public class Mamifero extends Animal {
    
    private String corPele;

    public Mamifero(double peso, int idade, int numeroMenbro, String corPele) {
        super(peso, idade, numeroMenbro);
        this.corPele = corPele;
    }

}
