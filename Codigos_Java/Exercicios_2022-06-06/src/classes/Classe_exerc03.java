package classes;

public class Classe_exerc03 {

    public void fatoriar(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++){
            result *= (i);
        }

        System.out.println("\nO fatorial do número é: " + result);

    }
}
