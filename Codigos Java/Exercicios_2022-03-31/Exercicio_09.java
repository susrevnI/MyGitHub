import java.util.Scanner;

public class Exercicio_B7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite o valor a ser cobrado o imposto: ");
        float valor = entrada.nextFloat();

        System.out.print("Digite a sigla do estado: ");
        String estado = entrada.next();

        float resultado = 0;

        switch (estado) {
            case "MG":
                resultado = valor * 107 / 100;
                break;
            case "SP":
                resultado = valor * 112 / 100;
                break;
            case "RJ":
                resultado = valor * 115 / 100;
                break;
            case "MS":
                resultado = valor * 108 / 100;
                break;
        }

        System.out.println("O valor com o inposto resulta em R$" + resultado);
        
        entrada.close();
    }
}
