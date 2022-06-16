/* Criar um programa que receba vários números inteiros e positivos e imprima a média dos
números múltiplos de 3. */

package mains;

import classes.Classe_exerc07;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Classe_exerc07 func = new Classe_exerc07();

        System.out.println("Olá usuário, digite 10 números inteiros positivos.\n");
        double num;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Número %d: ", i + 1);
            num = ent.nextDouble();
            while (num != (int) num || num < 0) {
                System.out.print("Só é aceito números inteiros positivos, escolha de novo: ");
                num = ent.nextDouble();
            }
            func.guardar((int) num);
        }

        func.calcular();

        ent.close();
    }
}
