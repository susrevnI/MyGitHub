/* Faça um programa que verifique os números de 0 a 500, e verifique se ele está entre o intervalo
de 100 e 200.  Se estiver dentro desta faixa, imprimir “Você digitou um número entre 100 e 200”,
senão  imprima “Você digitou um número fora da faixa”. */

package mains;

import classes.Classe_exerc01;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Classe_exerc01 func = new Classe_exerc01();

        /*boolean s;
        do {
            s = false;
            System.out.print("Escolha um número entre 0 e 500: ");
            double num = ent.nextDouble();
            if (num < 0 || num > 500) {
                System.out.println("Esse número não está entre 0 e 500, escolha de novo!");
                s = true;
            } else if (num >= 100 && num <= 200) {
                System.out.println("Você digitou um número entre 100 e 200");
            } else {
                System.out.println("Você digitou um número fora da faixa");
            }
        } while (s);*/

        System.out.print("Olá usuário, escolha um número entre 0 e 500: ");
        double num = ent.nextDouble();

        while (num < 0 || num > 500) {
            System.out.print("Esse número não está entre 0 e 500, escolha de novo: ");
            num = ent.nextDouble();
        }

        func.entre(num);

        ent.close();
    }
}
