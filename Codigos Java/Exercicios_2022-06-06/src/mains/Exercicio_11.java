/* Exercício Elevador
Criar uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve
armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador
e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
Construtor: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores
sempre começam no térreo e vazio);
Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Subir: para subir um andar (não deve subir se já estiver no último andar);
Descer: para descer um andar (não deve descer se já estiver no térreo). */

package mains;

import classes.Classe_exerc11;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int comand;

        System.out.print("Olá usuário, quantos andares tem no prédio: ");
        int andares = ent.nextInt() - 1;

        System.out.print("Qual a capacidade do elevador: ");
        int pessoas = ent.nextInt();

        Classe_exerc11 elevador = new Classe_exerc11(andares,pessoas);

        do {
            System.out.println("""
                    
                    Comandos:
                      1 - Sobe um andar;
                      2 - Desce um andar;
                      3 - Entra uma pessoa;
                      4 - Sai uma pessoa;
                      5 - Ve quantas pessoas te no elevador;
                      6 - Ve o andar atual do elevador;
                      0 - Encerra o programa.
                      """);

            System.out.print("Proximo comando: ");
            comand = ent.nextInt();

            switch (comand) {
                case 1 -> elevador.subir();
                case 2 -> elevador.descer();
                case 3 -> elevador.entrar();
                case 4 -> elevador.sair();
                case 5 -> elevador.verPessoas();
                case 6 -> elevador.verAndar();
            }

        } while (comand != 0);

        ent.close();
    }
}