import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, informe o valor em dolar: ");
        float dolar = entrada.nextFloat();

        float real = dolar * (float)4.67;

        System.out.println("O valor em reais é " + real);

        entrada.close();
    }
}