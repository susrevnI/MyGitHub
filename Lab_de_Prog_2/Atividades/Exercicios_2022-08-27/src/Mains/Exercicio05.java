package Mains;

import java.util.Scanner;

/**
 * Problema “Tabuada”
 * <p>
 * - Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10.
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nOlá usuário, esse programa irá retornar a tabuada de um número digitado.");

        while (true) {

            System.out.print("\nDigite um número: ");
            double numero = scan.nextDouble();

            while (numero != (int) numero) {
                System.out.print("O número deve ser um inteiro: ");
                numero = scan.nextDouble();
            }

            int numeroInt = (int) numero;

            for (int i = 1; i < 11; i++) {
                System.out.printf("\n%d x %d = %d", numeroInt, i, numeroInt * i);
            }

            System.out.print("\n\nDeseja calcular a tabuada novamente? (s/n): ");
            char cont = scan.next().charAt(0);

            while (cont != 's' && cont != 'S' && cont != 'n' && cont != 'N') {
                System.out.print("\nDigite 's' ou 'n': ");
                cont = scan.next().charAt(0);
            }

            if (cont == 'n' || cont == 'N') {
                break;
            }

        }

        scan.close();
    }
}