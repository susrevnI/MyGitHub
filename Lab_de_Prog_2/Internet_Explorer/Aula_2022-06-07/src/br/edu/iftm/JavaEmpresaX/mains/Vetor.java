package br.edu.iftm.JavaEmpresaX.mains;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor? ");
        int tamanhoVetor = ent.nextInt();

        int[] vetorDeInteiros = new int[tamanhoVetor];

        System.out.print("Digite valores para o vetor: ");
        for (int i = 0; i < vetorDeInteiros.length; i++){
            System.out.printf("\nVetor[%d] = ", i + 1);
            vetorDeInteiros[i] = ent.nextInt();
        }

        System.out.println("\nVetor impresso:");

        for (int i = 0; i < vetorDeInteiros.length; i++){
            System.out.printf("\nVetor[%d] = %d", i + 1, vetorDeInteiros[i]);
        }

    }
}
