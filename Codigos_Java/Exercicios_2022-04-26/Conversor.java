import java.util.Scanner;

public class Conversor {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.print("Olá usuário, digite a temperatura a ser convertida: ");
        converter.celsius = entrada.nextDouble();

        System.out.print("Digite para qual unidade deseja converter: ");
        converter.qual = entrada.next().charAt(0);

        double resulta = converter.conversãoFK();

        System.out.println("O resultado da conversão foi: " + resulta + " " +  converter.qual);

        entrada.close();
    }
}