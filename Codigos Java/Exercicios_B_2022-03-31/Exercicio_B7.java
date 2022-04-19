import java.util.Scanner;

public class Exercicio_B7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite o valor a ser cobrado o imposto: ");
        double valor = entrada.nextDouble();

        System.out.print("Digite a sigla do estado: ");
        String estado = entrada.next();

        double resultado = 0;

        switch (estado) {
            case "MG":
                resultado = valor * 1.07;
                break;
            case "SP":
                resultado = valor * 1.12;
                break;
            case "RJ":
                resultado = valor * 1.15;
                break;
            case "MS":
                resultado = valor * 1.08;
                break;
        }

        System.out.println("O valor com o inposto resulta em R$" + resultado);
        
        entrada.close();
    }
}
