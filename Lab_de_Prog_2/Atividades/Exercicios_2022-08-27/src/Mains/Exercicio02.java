package Mains;

import java.util.Scanner;

/**
 * Problema “Troco”
 * <p>
 * - Fazer um programa para calcular o troco no processo de pagamento de um
 * produto de uma mercearia. O programa deve ler o preço unitário do
 * produto, a quantidade de unidades compradas deste produto, e o valor em
 * dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu
 * programa deve mostrar o valor do troco a ser devolvido ao cliente.
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "\nOlá usuário, esse programa vai calcular o valor de uma compra e retornar o troco que deve dado.");

        while (true) {
            System.out.print("\nDigite o preço unitário do produto: ");
            double precoUnit = scan.nextDouble();

            System.out.print("Digite a quantidade de produtos comprados: ");
            double quant = scan.nextDouble();

            System.out.print("Digite o dinheiro recebido: ");
            double dinheiro = scan.nextDouble();

            System.out.printf("\nO troco é de R$%.2f\n", dinheiro - precoUnit * quant);

            System.out.print("\nDeseja calcular o troco novamente? (s/n): ");
            char cont = scan.next().charAt(0);

            while (cont != 's' && cont != 'S' && cont != 'n' && cont != 'N') {
                System.out.print("\nDigite 's' ou 'n': ");
                cont = scan.next().charAt(0);
            }

            if (cont == 'n' || cont == 'N') {
                break;
            }
        }

        scan.close();
    }
}