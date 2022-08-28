package subClasse;

import superClasse.Animal;

public class Ave extends Animal {
    
    private String CorPena;

    public Ave(double peso, int idade, int numeroMenbro, String corPena) {
        super(peso, idade, numeroMenbro);
        CorPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Ninho feito!");
    }
}
