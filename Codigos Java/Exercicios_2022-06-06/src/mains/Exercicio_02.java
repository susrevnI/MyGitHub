/* Faça um programa que de 0 a 100 verifique se o número é par ou impar. Caso esse valor seja par,
deverá imprimir “Número par” caso contrário, “Número ímpar”. */

package mains;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Olá usuário, escolha um número entre 0 e 100: ");
        double num = ent.nextDouble();

        while (num < 0 || num > 100) {
            System.out.print("Esse número não está entre 0 e 100, escolha de novo: ");
            num = ent.nextDouble();
        }
        while (num != (int) num) {
            System.out.print("Não é aceito números decimais, escolha de novo: ");
            num = ent.nextDouble();
        }

        if (num % 2 == 0) {
            System.out.println("Esse número é Par!");
        } else {
            System.out.println("Esse número é Impar!");
        }

        ent.close();
    }
}
