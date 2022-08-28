package br.edu.iftm.rpgjava.teste;
import java.util.Random;
import java.util.Scanner;

import br.edu.iftm.rpgjava.classes.Guerreiro;
import br.edu.iftm.rpgjava.classes.Mago;
import br.edu.iftm.rpgjava.classes.Arqueiro;

public class Principal {

    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Vladimir", 80, 50, 30, -3, 0, 80, 100, 90, 10, 63);
        Mago m = new Mago("Agostinho Carrara", 0, 90, 0, 95, 0, 50, 40, 45, 85, 100);
        Arqueiro a = new Arqueiro("Jhonson", 0, 90, 0, 60, 0, 30, 75, 0, 5, 60);
        Scanner intervalo = new Scanner(System.in);

        // Guerreiro
        /*g.setNome("Vladimir");
        g.setForca(80);
        g.setAgilidade(30);
        g.setCarisma(0);
        g.setDestreza(50);
        g.setInteligencia(-3);
        g.setEstamina(90);
        g.resistencia = 80;
        g.sorte = 10;
        g.vida = 100;
        g.mana = 63;*/

        // Mago
        /*m.nome = "Agostinho Carrara";
        m.mana = 100;
        m.vida = 40;
        m.destreza = 90;
        m.resistencia = 50;
        m.sorte = 85;
        m.inteligencia = 125;*/

        // Arqueiro
        /*a.nome = "Jhonson";
        a.destreza = 90;
        a.resistencia = 30;
        a.estamina = 45;
        a.sorte = 5;
        a.vida = 75;
        a.inteligencia = 60;
        a.mana = 60;*/
        a.setCarisma(20);

        Random dado = new Random();

        int round = 1;
        while (g.getVida() > 0 && m.getVida()> 0) {
            System.out.println("\n -- Round: " + round + "\n");
            System.out.println("Oponente 1: " + g.getNome() + " -- Vida: " + g.getVida());
            System.out.println("Oponente 2: " + m.getNome() + " -- Vida: " + m.getVida());
            intervalo.nextLine();

            // Turno do Mago
            System.out.println(" --- Turno do mago!\n");
            int valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            intervalo.nextLine();

            int valorAtaque = m.atacar(valorDado);
            g.defender(valorAtaque);
            intervalo.nextLine();

            // Turno do Guerreiro
            System.out.println(" --- Turno do guerreiro!\n");
            valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            intervalo.nextLine();

            valorAtaque = g.atacar(valorDado);
            m.defender(valorAtaque);
            intervalo.nextLine();

            round++;
        }

        if (g.getVida() <= 0) {
            System.out.println("\n!!!!!!!!! O mago venceu !!!!!!!!!!\n");
        } else if (m.getVida() <= 0) {
            System.out.println("\n!!!!!!!!! O guerreiro venceu !!!!!!!!!!\n");
        }

        // int valorAtaque = g.atacar(6);
        // System.out.println(g.defender(valorAtaque));

        intervalo.close();
    }
}
