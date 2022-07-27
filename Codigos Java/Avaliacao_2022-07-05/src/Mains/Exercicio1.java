package Mains;

import Classes.ClasseEx1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ClasseEx1 func = new ClasseEx1();

        System.out.print("Digite um numero inteiro positivo para fatorar: ");
        double num = ent.nextDouble();

        while (num != (int)num || num < 0){
            System.out.print("Numero invalido, digite novamente: ");
            num = ent.nextDouble();
        }

        func.fatorar( (int)num );

        ent.close();
    }
}
