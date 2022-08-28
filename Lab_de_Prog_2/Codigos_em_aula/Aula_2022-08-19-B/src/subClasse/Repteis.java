package subClasse;

import superClasse.Animal;;

public class Repteis extends Animal {
    
    private String corEscama;

    public Repteis(double peso, int idade, int numeroMenbro, String corEscama) {
        super(peso, idade, numeroMenbro);
        this.corEscama = corEscama;
    }

}
