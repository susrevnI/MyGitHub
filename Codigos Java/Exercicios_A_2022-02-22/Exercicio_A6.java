import java.util.Scanner;

public class Exercicio_A6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite a temperatura em graus Celsius: ");
        float tempCel = entrada.nextFloat();

        float tempFah = tempCel * 9/5 + 32;

        System.out.println("A temperatura em graus Fahrenheit é " + tempFah);
    }
}