/* Criar um programa que leia 10 números positivos e imprima a raiz quadrada de cada número. */

package mains;

import classes.Classe_exerc06;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Classe_exerc06 func = new Classe_exerc06();

        System.out.println("Olá usuário, digite 10 números que queira saber a raiz quadrada.\n");
        double num;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Número %d: ", i + 1);
            num = ent.nextDouble();
            func.guardar(num);
        }

        func.mostrar();

        ent.close();
    }
}
