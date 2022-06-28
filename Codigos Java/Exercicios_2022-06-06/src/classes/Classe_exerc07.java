package classes;

public class Classe_exerc07 {

    private final int[] numeros = new int[10];
    private int i = 0;

    public void guardar(int num) {
        numeros[i] = num;
        i++;
    }

    public void calcular() {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 3 == 0) {
                soma += numeros[i];
                media++;
            }
        }

        if (soma != 0) {
            media = soma / media;
        }
        System.out.printf("A media dos multiplos de '3' foi '%f'.", media);
    }
}