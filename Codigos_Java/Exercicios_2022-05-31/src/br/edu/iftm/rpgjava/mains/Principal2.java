package br.edu.iftm.rpgjava.mains;

import br.edu.iftm.rpgjava.classes.*;

import java.util.Random;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Vladimir", 30, 30, 30, 30,
                30, 30, 30, 30, 30, 30);
        Arqueiro a = new Arqueiro("Agostinho Carrara", 30, 30, 30, 30,
                30, 30, 30, 30, 30, 30);
        Mago m = new Mago("Jhoson", 30, 30, 30, 30,
                30, 30, 30, 30, 30, 30);
        Armadura armadura = new Armadura("Couraça de bronze", 10, 40, 50);
        Arma arma = new Arma("nome", 20, 35);

        Scanner ent = new Scanner(System.in);

        Random dado = new Random();
        int round = 1;

        int i = 3;
        int vg = 0;
        int va = 0;
        int vm = 0;
        while (i > 1) {
            i = 0;
            int valorAtaque;
            System.out.println("    ------------- Round " + round + " -------------");
            System.out.println("");

            if (g.getVida() > 0) {
                //   ---------src.br.edu.iftm.rpgjava.classes.Guerreiro----------
                vg = 1;
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                System.out.print("src.br.edu.iftm.rpgjava.classes.Guerreiro, qual oponente quer atacar? ");
                char ataque = ent.next().charAt(0);

                if (ataque == 'm' && m.getVida() > 0) {
                    valorAtaque = g.atacar(valorDado, m.getResistencia());
                    m.defender(valorAtaque);

                } else if (ataque == 'a' && a.getVida() > 0){
                    valorAtaque = g.atacar(valorDado, a.getResistencia());
                    a.defender(valorAtaque);

                }
                System.out.println("");

            } else {
                vg = 0;
            }

            if (a.getVida() > 0) {
                //   ---------src.br.edu.iftm.rpgjava.classes.Arqueiro----------
                va = 1;
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                System.out.print("src.br.edu.iftm.rpgjava.classes.Arqueiro, qual oponente quer atacar? ");
                char ataque = ent.next().charAt(0);

                if (ataque == 'm' && m.getVida() > 0) {
                    valorAtaque = a.atacar(valorDado, m.getResistencia());
                    m.defender(valorAtaque);

                } else if (ataque == 'g' && a.getVida() > 0){
                    valorAtaque = a.atacar(valorDado, g.getResistencia());
                    g.defender(valorAtaque);

                }
                System.out.println("");

            } else {
                va = 0;
            }

            if (m.getVida() > 0) {
                //   ---------src.br.edu.iftm.rpgjava.classes.Mago----------
                vm = 1;
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                System.out.print("src.br.edu.iftm.rpgjava.classes.Mago, qual oponente quer atacar? ");
                char ataque = ent.next().charAt(0);

                if (ataque == 'g' && m.getVida() > 0) {
                    valorAtaque = m.atacar(valorDado, g.getResistencia());
                    g.defender(valorAtaque);

                } else if (ataque == 'a' && a.getVida() > 0){
                    valorAtaque = m.atacar(valorDado, a.getResistencia());
                    a.defender(valorAtaque);

                }
                System.out.println("");

            } else {
                vm = 0;
            }

            System.out.println("Vida src.br.edu.iftm.rpgjava.classes.Guerreiro: " + g.getVida());
            System.out.println("Vida src.br.edu.iftm.rpgjava.classes.Arqueiro: " + a.getVida());
            System.out.println("Vida src.br.edu.iftm.rpgjava.classes.Mago: " + m.getVida());
            System.out.println("");
            System.out.println(" --- Fim round " + round + " ---");
            System.out.println("");

            round++;
            i = vg + va + vm;
        }


        if (vg > 0) {
            System.out.println("Gerreiro " + g.getNome() + " foi campeão!!!");
        } else if (vm > 0) {
            System.out.println("src.br.edu.iftm.rpgjava.classes.Mago " + m.getNome() + " foi campeão!!!");
        } else if (va > 0){
            System.out.println("src.br.edu.iftm.rpgjava.classes.Arqueiro " + a.getNome() + " foi campeão!!!");
        }

    }
}


