/* Exercício Contador
Criar uma classe Contador que encapsule um valor usado para a contagem de itens ou eventos.
A classe deve conter métodos que devem:
    Zerar o contador;
    Incrementar o contador em uma unidade;
    Retornar o valor do contador;
    O programa deve instanciar objetos da classe Contador e utilizar seus métodos. */

package mains;

import classes.Classe_exerc08;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Classe_exerc08 contador = new Classe_exerc08();

        System.out.println("Olá usuário, eis aqui um contador de valor '0'.");
        char comand;

        do {
            System.out.println("""
                                        
                    Comandos:
                      '+' -> soma um no contador;
                      '-' -> subtrai um do contador;
                      '*' -> zera o contador;
                      '0' -> encerra o programa.
                    """);
            System.out.print("Proximo comando: ");
            comand = ent.next().charAt(0);

            contador.contar(comand);

        } while (comand != '0');

        ent.close();
    }
}
