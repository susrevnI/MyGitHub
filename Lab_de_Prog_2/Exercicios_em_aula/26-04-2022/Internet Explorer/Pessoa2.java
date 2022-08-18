import java.util.Scanner;

public class Pessoa2 {
    
    public static void main(String[] args) {
        Conversão converter = new Conversão();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite a temperatura em graus celsius: ");
        converter.celsius = entrada.nextFloat();

        System.out.print("Para qual quer converter(Fahrenheit = F, Kelvin = K)? ");
        converter.qual = entrada.next().charAt(0);

        converter.conversãoFK();

        entrada.close();

    }
}
