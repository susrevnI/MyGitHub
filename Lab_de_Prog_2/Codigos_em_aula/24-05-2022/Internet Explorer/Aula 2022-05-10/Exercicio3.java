import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite um valor inteiro: ");
        float numero = entrada.nextFloat();

        float numero2 = numero / 2;

        // if (numero % 2 == 0) {
        //     System.out.println("Esse numero é par, pois o resto da divisão por 2 é igual a 0");
        // } else {
        //     System.out.println("Esse numero é impar, pois o resto da divisão por 2 é diferente de 0");
        // }

        if (numero2 == (int)numero2) {
            System.out.println("Esse numero é par, pois o resto da divisão por 2 é igual a 0");
        } else {
            System.out.println("Esse numero é impar, pois o resto da divisão por 2 é diferente de 0");
        }

        entrada.close();
    }
}