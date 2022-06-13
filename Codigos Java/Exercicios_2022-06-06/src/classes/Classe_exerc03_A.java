package classes;

public class Classe_exerc03_A {

    public void fatoriar(double num) {
        System.out.print("Os fatorias do número " + num + " é: ");
        double result = num;

        for (int i = 2; i < num / 2; ) {
            if (result % i == 0) {
                result /= i;
                if (result != 1) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + ".");
                }
            } else {
                i++;
            }
        }
    }
}
