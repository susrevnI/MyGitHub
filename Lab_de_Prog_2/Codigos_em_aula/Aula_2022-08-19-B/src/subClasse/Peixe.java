package subClasse;

import superClasse.Animal;

public class Peixe extends Animal {
    
    private String corEscama;

    public Peixe(double peso, int idade, int numeroMenbro, String corEscama) {
        super(peso, idade, numeroMenbro);
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Blo Blo Blo (°O°)");
    }
}
