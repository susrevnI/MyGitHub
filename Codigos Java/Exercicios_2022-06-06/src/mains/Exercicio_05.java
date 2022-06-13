/* Faça um programa que simule o menu de uma agenda eletrônica.
Agenda deve possuir opções tais como: (só precisa criar o menu)
1 - Adicionar contato;
2 - buscar contato;
3 - remover contato;
4 - editar contato;
5 -  sair */

package mains;

import classes.Classe_exerc05_A;
import classes.Classe_exerc05_B;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Classe_exerc05_A lista = new Classe_exerc05_A();
        Scanner ent = new Scanner(System.in);
        boolean sair = false;
        int comando;

        System.out.println("\n--- Lista eletronica ---");

        do {
            String nome;
            String numero;
            String space = "; ";

            System.out.println("""
                    \n-- Comandos --
                    1 - Adicionar contato;
                    2 - buscar contato;
                    3 - remover contato;
                    4 - editar contato;
                    5 -  sair\n""");

            System.out.print("Proximo comando: ");
            comando = ent.nextInt();

            if (comando == 1) {
                System.out.print("\n- Novo contato -\n   Nome: ");
                nome = ent.next();
                nome = nome + space;
                System.out.print("   Numero: ");
                numero = ent.next();
                numero = numero + space;

                lista.listar(nome, numero);
            }

        } while (comando != 5);

        System.out.println(lista.getLista(1));

        ent.close();
    }
}