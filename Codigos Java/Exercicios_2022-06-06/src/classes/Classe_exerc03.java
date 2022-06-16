package classes;

public class Classe_exerc03 {

    public void fatoriar(int num) {
        System.out.print("Os fatorias do número " + num + " é: ");
        int result = num;

        for (int i = 2; i <= num; ) {
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
