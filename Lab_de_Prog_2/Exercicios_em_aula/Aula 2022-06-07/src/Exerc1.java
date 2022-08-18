import java.sql.SQLOutput;
import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        System.out.println("Digite um número no intervalo de 0 a 500: ");
        int numero = batata.nextInt();

        if (numero <= 500 && numero >= 0){

            if (numero >= 100 && numero <= 200 ){
                System.out.println("Você digitou um número entre 100 e 200");
            }else {
                System.out.println("Você Digitou fora da faixa entre 100 e 200");
                System.out.println(numero);
        }
        } else {
            System.out.println("Você excedeu o limite");
        }
    }
}
