/* Faça um programa que calcule o fatorial de um número informado via teclado. */

package mains;

import classes.Classe_exerc03;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Classe_exerc03 func = new Classe_exerc03();

        System.out.print("Olá usuário, escolha um número para fatoriar: ");
        double num = ent.nextDouble();

        while (num != (int) num || num < 0) {
            System.out.println("Número decimais e negativos não são aceitos, escolha de novo: ");
            num = ent.nextDouble();
        }

        func.fatoriar((int) num);

        ent.close();
    }
}
