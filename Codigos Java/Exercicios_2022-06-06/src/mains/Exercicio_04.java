/*Faça um programa que calcule os 20 primeiros múltiplos de um valor informado via  teclado. */

package mains;

import classes.Classe_exerc04;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Classe_exerc04 func = new Classe_exerc04();

        System.out.print("Olá usuário, escolha um número para encontrar os 20 primeiros multiplos: ");
        double num = ent.nextDouble();

        while (num != (int) num) {
            System.out.println("Número decimais não são aceitos, escolha de novo: ");
            num = ent.nextDouble();
        }

        func.multiplos((int) num);

        ent.close();
    }
}