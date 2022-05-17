import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite a velocidade em km/h a ser convertida: ");
        float veloctKm = entrada.nextFloat();

        float veloctMs = veloctKm / (float)3.6;

        System.out.println("A conversão foi de " + veloctMs + " m/s");

        entrada.close();
    }
}