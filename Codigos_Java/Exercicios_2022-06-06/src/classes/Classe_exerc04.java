package classes;

public class Classe_exerc04 {
    public void multiplos(int num) {
        System.out.print("Os multiplos de " + num + " são: ");
          /* Obs: O primeiro multiplo de um numero é o 0, ou seja, o 20° é obitido com a
          multiplicação do número por 19 */

        for (int i = 0; i < 20; i++) {
            System.out.print(", " + num * i);
        }
        System.out.println(".");
    }
}
