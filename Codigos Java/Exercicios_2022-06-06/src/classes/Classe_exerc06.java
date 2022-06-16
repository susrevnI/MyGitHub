package classes;

public class Classe_exerc06 {

    private final double[] numeros = new double[10];
    private int i = 0;

    public void guardar(double num) {
        numeros[i] = num;
        i++;
    }

    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nA raiz de %f é '%s';", numeros[i], Math.sqrt(numeros[i]));
        }
    }
}
