/* Faça um programa que de 0 a 100 verifique se o número é par ou impar. Caso esse valor seja par,
deverá imprimir “Número par” caso contrário, “Número ímpar”. */

package mains;

import classes.Classe_exerc02;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Classe_exerc02 func = new Classe_exerc02();

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

        func.imParPar(num);

        ent.close();
    }
}
