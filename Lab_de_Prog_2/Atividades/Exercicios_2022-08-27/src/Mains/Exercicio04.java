package Mains;

import java.util.Scanner;

/**
 * Problema “Crescente ou Decrescente”
 * <p>
 * - Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
 * Escreva para cada X e Y uma mensagem que indique se estes valores foram
 * digitados em ordem crescente ou decrescente. O programa deve finalizar
 * quando forem digitados dois valores iguais.
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "\nOlá usuário, esse programa irá comparar dois números e dizer se estão em ordem crescente ou decrescente. \n"
                        + "Ele será encerado caso dois números iguais sejam digitados.\n");

        while (true) {

            System.out.print("Digite o primeiro número: ");
            double numero1 = scan.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scan.nextDouble();

            if (numero1 > numero2) {
                System.out.println("\nEstão em ordem 'decrescente'.\n");
            } else if (numero2 > numero1) {
                System.out.println("\nEstão em ordem 'crescente'.\n");
            } else {
                break;
            }
        }

        scan.close();
    }
}