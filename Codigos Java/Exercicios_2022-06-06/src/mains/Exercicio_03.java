/* Faça um programa que calcule o fatorial de um número informado via teclado. */

package mains;

import classes.Classe_exerc03_A;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Classe_exerc03_A func = new Classe_exerc03_A();

        System.out.print("Olá usuário, escolha um número para fatoriar: ");
        double num = ent.nextDouble();

        while (num != (int) num){
            System.out.println("Número decimais não são aceitos, escolha de novo: ");
            num = ent.nextDouble();
        }

        func.fatoriar(num);

        ent.close();
    }
}
