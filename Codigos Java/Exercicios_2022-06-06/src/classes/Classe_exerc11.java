package classes;

import java.security.KeyStore;
import java.util.PrimitiveIterator;

public class Classe_exerc11 {
    private int andarAtual = 0;
    private final int totalAndares;
    private int pessoasAtuaL = 0;
    private final int totalPessoas;

    public Classe_exerc11(int totalAndares, int totalPessoas) {
        this.totalAndares = totalAndares;
        this.totalPessoas = totalPessoas;
    }

    public void entrar(){
        if (pessoasAtuaL<totalPessoas){
            pessoasAtuaL++;
            System.out.printf("\nHá %d pessoas no elevador.\n", pessoasAtuaL);
        } else {
            System.out.println("\nElevador cheio.");
        }
    }

    public void sair(){
        if (pessoasAtuaL > 0){
            pessoasAtuaL--;
            System.out.printf("\nHá %d pessoas no elevador.\n", pessoasAtuaL);
        } else {
            System.out.println("\nElevador vasio.");
        }
    }

    public void subir(){
        if (andarAtual<totalAndares){
            andarAtual++;
            System.out.printf("\nO elevador está no %d° andar.\n", andarAtual+1);
        } else {
            System.out.println("\nJá esta no ultimo andar.");
        }
    }

    public void descer(){
        if (andarAtual > 0){
            andarAtual--;
            System.out.printf("\nO elevador está no %d° andar.\n", andarAtual+1);
        } else {
            System.out.println("\nJá está no térreo.");
        }
    }

    public void verPessoas(){
        System.out.printf("\nHá %d pessoas no elevador.\n", pessoasAtuaL);
    }

    public void verAndar(){
        System.out.printf("\nO elevador está no %d° andar.\n", andarAtual+1);
    }
}
