package src.br.edu.iftm.rpgjava.main;

import src.br.edu.iftm.rpgjava.classes.Arqueiro;
import src.br.edu.iftm.rpgjava.classes.Guerreiro;
import src.br.edu.iftm.rpgjava.classes.Mago;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro();
        Arqueiro a = new Arqueiro();
        Mago m = new Mago();

        Scanner ent = new Scanner(System.in);

        System.out.print("Olá jogador, escolha a classe do primeiro participante (G,A,M): ");
        char joga1 = ent.next().charAt(0);

        System.out.print("Escolha a classe do segundo participante (G,A,M): ");
        char joga2 = ent.next().charAt(0);

        int round = 0;
        while (jog1.getVida() > 0 || jog2.getVida() > 0){

        }

    }
}
