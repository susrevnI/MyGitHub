package PastaTeste.Principal;

import PastaTeste.Classe.Calculadora;

public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.soma(4, 3));

        System.out.println(200.0 * 1.07f);
    }
}
