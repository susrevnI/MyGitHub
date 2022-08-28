package Mains;

import java.util.Scanner;

/**
 * Problema “Senha_fixa”
 * <p>
 * - Escreva um programa que repita a leitura de uma senha até que ela seja
 * válida. Para cada leitura de senha incorreta informada, escreva a mensagem
 * "Senha Inválida! Tente novamente:". Quando a senha for informada corretamente
 * deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
 * Considere que a senha correta é o valor 2002.
 */
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nOlá usuário, esse programa verifica se a senha digitada é valida.");

        int senha = 2002;

        System.out.print("\nDigite a senha: ");
        double confSenha = scan.nextDouble();

        while (confSenha != senha) {
            System.out.print("Senha invalida. Digite novamente: ");
            confSenha = scan.nextDouble();
        }

        System.out.println("\nAcesso permitido!");

        scan.close();
    }
}