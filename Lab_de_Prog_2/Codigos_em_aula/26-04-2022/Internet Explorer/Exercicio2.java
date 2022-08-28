import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá ususário, digite o valor a ser calculado a taxa: ");
        float valor = entrada.nextFloat();

        System.out.print("Digite a sigla do estado: ");
        String sigla = entrada.next();

        float resultado;

        switch (sigla) {
            case "MG":
                resultado = valor * 1.07f;                
                break;

            case "SP":
                resultado = valor * 1.12f;                
                break;

            case "RJ":
                resultado = valor * 1.15f;
                break;

            case "MS":
                resultado = valor * 1.08f;                
                break;

            default:
                resultado = valor * 1.09f;                
                break;
        }

        System.out.println("O preço final é " + resultado);
        
        entrada.close();
    }
}