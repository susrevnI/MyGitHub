package Mains;

import java.util.Scanner;

/**
 * Problema “Diabetes”
 * <p>
 * - Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa
 * e depois mostrar na tela a classificação desta glicose de acordo com a tabela
 * de referência ao lado.
 */
public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "\nOlá usuário, esse programa verifica o nível de glicose no sangue digitada e retorno o índice normal, elevado e diabético.");

        System.out.print("\nDigite o nivel de glicose no sangue: ");
        double glicose = scan.nextDouble();

        if (glicose < 100) {
            System.out.println("\nNivel normal.");
        } else if (glicose >= 100 && glicose <= 140) {
            System.out.println("\nNivel elevado.");
        } else {
            System.out.println("\nNivel diabetico.");
        }

        scan.close();
    }
}