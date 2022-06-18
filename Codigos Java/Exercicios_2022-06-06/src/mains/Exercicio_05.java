/* Faça um programa que simule o menu de uma agenda eletrônica.
Agenda deve possuir opções tais como: (só precisa criar o menu)
1 - Adicionar contato;
2 - buscar contato;
3 - remover contato;
4 - editar contato;
5 -  sair */

package mains;

import classes.Classe_exerc05_A;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Classe_exerc05_A lista = new Classe_exerc05_A();
        int comando;

        System.out.println("""

                --- Agenda Eletrônica --- |Capacidade '20' contatos|""");

        do {
            String nome;
            String numero;

            System.out.println("""
                    \n-- Comandos --
                      1 - Adicionar contato;
                      2 - Buscar contato;
                      3 - Remover contato;
                      4 - Editar contato;
                      5 - Ver todos os contatos;
                      0 - Sair.
                    """);

            System.out.print("Proximo comando: ");
            comando = ent.nextInt();
            ent.nextLine();

            switch (comando) {
                case 1:
                    if (!lista.cheioTF()) {
                        System.out.print("\n- Novo contato -\n   Nome: ");
                        nome = ent.nextLine();
                        System.out.print("   Número: ");
                        numero = ent.nextLine();

                        lista.listar(nome, numero);
                    } else {
                        System.out.println("\nAgenda cheia.");
                    }
                    break;
                case 2:
                    if (!lista.cheioTF()) {
                        System.out.print("""
                                \nComo deseja procurar?
                                  1 - Posiçao;
                                  2 - Nome;
                                  3 - Número;
                                  0 - Sair;
                                \nOpção:\040""");
                        double opcao = ent.nextDouble();

                        while (opcao != (int) opcao || opcao > 3 || opcao < 1) {
                            System.out.print("Essa opção não existe, escolha de novo:");
                            opcao = ent.nextDouble();
                        }
                        ent.nextLine();

                        switch ((int) opcao) {
                            case 1 -> {
                                System.out.print("\nDigite a posição do contato que deseja buscar: ");
                                double posicao = ent.nextDouble();
                                while (posicao != (int) posicao || posicao > lista.tamanhoLista() || posicao < 1) {
                                    System.out.print("Essa posição não existe, escolha de novo: ");
                                    posicao = ent.nextDouble();
                                }
                                lista.buscarPosc((int) posicao);
                            }
                            case 2 -> {
                                System.out.print("\nDigite o nome (ou parte dele) do contato que deseja buscar: ");
                                String nom = ent.nextLine();
                                lista.buscarNome(nom);
                            }
                            case 3 -> {
                                System.out.print("\nDigite o número (ou parte dele) do contato que deseja buscar: ");
                                String num = ent.nextLine();
                                lista.buscarNum(num);
                            }
                        }
                    } else {
                        System.out.println("\nSem contatos na agenda.");
                    }
                    break;
                case 3:
                    if (lista.todosContatos()) {
                        System.out.print("\nDigite a posição do contato que deseja remover: ");
                        double posicao = ent.nextDouble();

                        while (posicao != (int) posicao || posicao > lista.tamanhoLista() || posicao < 1) {
                            System.out.print("Essa posição não existe, escolha de novo: ");
                            posicao = ent.nextDouble();
                        }

                        lista.deletar((int) posicao);
                    }
                    break;
                case 4:
                    if (lista.todosContatos()) {
                        System.out.print("\nDigite a posição do contato que deseja editar: ");
                        double posicao = ent.nextDouble();

                        while (posicao != (int) posicao || posicao > lista.tamanhoLista()
                                || posicao < 1 || lista.poscEsp((int) posicao) == null) {
                            System.out.print("Essa posição não existe, escolha de novo: ");
                            posicao = ent.nextDouble();
                        }
                        ent.nextLine();

                        System.out.print("\nNovo nome: ");
                        nome = ent.nextLine();
                        System.out.print("Novo número: ");
                        numero = ent.nextLine();

                        lista.editar((int) posicao , nome, numero);
                    }
                    break;
                case 5:
                    lista.todosContatos();
                    break;
            }

        } while (comando != 0);

        ent.close();
    }
}
