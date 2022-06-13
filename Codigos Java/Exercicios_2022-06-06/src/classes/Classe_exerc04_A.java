package classes;

public class Classe_exerc04_A {
     public void multiplos(double num){
          System.out.print("Os multiplos de " + (int)num + " são: 0");
          /* Obs: O primeiro multiplo de um numero é o 0, ou seja, o 20° é obitido com a
          multiplicação do número por 20 */

          for (int i = 1; i < 20; i++) {
               System.out.print(", " + (int)num*i);
          }
          System.out.println(".");
     }
}
