/* Exercício Lâmpada
Criar uma classe Lâmpada que pode ser ligada e desligada. Também deve ser possível observar o estado da lâmpada.
O programa deve instanciar objetos da classe Lampada e utilizar seus métodos. */

package mains;

import classes.Classe_exerc09;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Classe_exerc09 func = new Classe_exerc09();

        System.out.println("Olá usuário, a lâmpada esta desligada.");
        int comand = 3;

        do {
            System.out.println("""
                                                
                    Comandos:
                      0 - Desliga a lâmpada;
                      1 - liga a lâmpada;
                      2 - Visualiza o estado da lâmpada;
                      3 - Encerra o programa.
                    """);

            System.out.print("Proximo comando: ");
            comand = ent.nextInt();

            func.onOff(comand);

        } while (comand != 3);

        ent.close();
    }
}
