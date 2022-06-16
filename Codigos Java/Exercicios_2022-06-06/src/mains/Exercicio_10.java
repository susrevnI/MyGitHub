/* Exercício Conta
Criar uma classe Conta que contenha o nome do cliente, o número da conta e o saldo. Estes valores deverão
ser informados no construtor da classe;
Criar um método depositar e um método sacar para realizar o depósito e o saque de valores da conta;
Criar métodos getters para cada atributo da classe.
O programa deve instanciar objetos da classe Conta e utilizar seus métodos. */

package mains;

import classes.Classe_exerc10;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String nome;
        String numConta;
        double saldo;
        int comand;

        System.out.println("Olá usuário, crie uma conta.\n");

        System.out.print("Qual o seu nome: ");
        nome = ent.nextLine();
        System.out.print("Qual o numero da sua conta: ");
        numConta = ent.nextLine();
        System.out.print("Qual o seu saldo inicial: ");
        saldo = ent.nextDouble();

        Classe_exerc10 conta = new Classe_exerc10(nome,numConta,saldo);

        do {
            System.out.println("""
                    
                    Comandos:
                      1 - Depositar;
                      2 - Sacar;
                      3 - Dados da conta;
                      0 - sair.
                    """);

            System.out.print("Proximo comando: ");
            comand = ent.nextInt();

            switch (comand){
                case 1:
                    System.out.print("\nQuanto quer depositar: ");
                    double deposito = ent.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("\nQuanto quer sacar: ");
                    double saque = ent.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.visializar();
                    break;
            }
        } while (comand != 0);

        ent.close();
    }
}
