import java.util.Scanner;

public class Exercicio_05 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite um número positivo: ");
        double numero = entrada.nextDouble();

        if (numero < 0) {
            System.out.println("O número digitado é negativo, por favor digite outro numero.");
        } else {
            double quadrado = numero * numero;
            double raiz = Math.sqrt(numero);

            System.out.println("O numero ao quadrado é " + quadrado + " e a raiz quadrada é " + raiz);
        }

        entrada.close();
    }
}
