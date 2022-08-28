package RevisaoLista;

import java.util.Scanner;

public class RevisaoEx7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem digitados: ");
        int tamanho = entrada.nextInt();

        int[] vetor = new int[tamanho];

        float media;
        int contador = 0;
        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            int numero = -1;

            while (numero < 0){
                System.out.print("Digite um número inteiro e positivo: ");
                numero = entrada.nextInt();
                if (numero < 0) {
                    System.out.print("O numero informado é negativo! Digite um numero positivo: ");
                }
            }

            if (numero >= 0){
                vetor[i] = numero;
                if (vetor[i] % 3 == 0){
                    soma = soma + vetor[i];
                    contador++;
                }
            }
        }

        media = ((float) soma) / contador;
        System.out.println(media);
    }
}