package Mains;

import java.util.Scanner;

/**
 * Problema “Idades”
 * <p>
 * - Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar
 * uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa
 * decimal.
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "\nOlá usuário, esse programa irá pegar nome e idade de duas pessoas e retornar a idade media das duas.");

        while (true) {

            // Dados da primeira pessoa
            System.out.print("\nDigite o nome da primeira pessoa: ");
            String nome1 = scan.nextLine();

            System.out.print("Digite a idade da primeira pessoa: ");
            double idade1 = scan.nextDouble();

            while (idade1 != (int) idade1) {
                System.out.print("A idade deve ser um número inteiro: ");
                idade1 = scan.nextDouble();
            }

            // Dados da segunda pessoa
            scan.nextLine();
            System.out.print("\nDigite o nome da segunda pessoa: ");
            String nome2 = scan.nextLine();

            System.out.print("Digite a idade da segunda pessoa: ");
            double idade2 = scan.nextDouble();

            while (idade2 != (int) idade2) {
                System.out.print("A idade deve ser um número inteiro: ");
                idade2 = scan.nextDouble();
            }

            System.out.printf("\nA idade média de %s e %s é de %.1f anos.\n", nome1, nome2, (idade1 + idade2) / 2);

            System.out.print("\nDeseja calcular a idade média novamente? (s/n): ");
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