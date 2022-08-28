import java.util.Random;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro();
        Mago m = new Mago();
        Arqueiro a = new Arqueiro();
        Scanner intervalo = new Scanner(System.in);

        // Guerreiro
        g.nome = "Vladimir";
        g.forca = 70;
        g.agilidade = 30;
        g.carisma = 0;
        g.destreza = 50;
        g.inteligencia = -3;
        g.estamina = 90;
        g.resistencia = 80;
        g.sorte = 10;
        g.vida = 100;
        g.mana = 63;

        // Mago
        m.nome = "Agostinho Carrara";
        m.mana = 100;
        m.vida = 40;
        m.destreza = 90;
        m.resistencia = 50;
        m.sorte = 85;
        m.inteligencia = 125;

        // Arqueiro
        a.nome = "Jhonson";
        a.destreza = 90;
        a.resistencia = 30;
        a.estamina = 45;
        a.sorte = 5;
        a.vida = 75;
        a.inteligencia = 60;
        a.mana = 60;

        Random dado = new Random();

        int round = 1;
        while (g.vida > 0 && m.vida > 0) {
            System.out.println("\n -- Round: " + round + "\n");
            System.out.println("Oponente 1: " + g.nome + " -- Vida: " + g.vida);
            System.out.println("Oponente 2: " + m.nome + " -- Vida: " + m.vida);
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

            round ++;
        }

        if (g.vida <= 0){
            System.out.println("\n!!!!!!!!! O mago venceu !!!!!!!!!!\n");
        }else if (m.vida <= 0) {
            System.out.println("\n!!!!!!!!! O guerreiro venceu !!!!!!!!!!\n");
        }

        // int valorAtaque = g.atacar(6);
        // System.out.println(g.defender(valorAtaque));

        intervalo.close();
    }
}
