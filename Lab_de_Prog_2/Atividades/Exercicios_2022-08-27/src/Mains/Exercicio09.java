package Mains;

import java.util.Scanner;

import Classes.ClasseEx09;

/**
 * Problema “Cambio”
 * <p>
 * - Faça um programa para ler a cotação do dólar, e depois um valor em dólares
 * a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
 * sobre o valor em dólar. Criar uma classe ConversorMoeda para ser responsável
 * pelos cálculos (Dica: utilize métodos estáticos).
 */
public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "\nOlá usuário, esse programa irá calcular o valor a pagar em reais por determinada quantia em dólares, com juros de 6% no dólar.");

        System.out.print("\nDigite o valor do dólar atualmente: ");
        double dolarAtual = scan.nextDouble();

        System.out.print("Digite o valor total em dólares: ");
        double totalDolares = scan.nextDouble();

        double totalReais = ClasseEx09.dolarParaReal(dolarAtual, totalDolares);

        System.out.printf("\nO valor total a pagar em reais é R$ %.2f.", totalReais);

        scan.close();
    }

}