import java.util.Scanner;

public class Exercicio_10 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite o número x: ");
        int x = entrada.nextInt();

        System.out.print("Digite o número y: ");
        int y = entrada.nextInt();

        System.out.print("Digite o número z: ");
        int z = entrada.nextInt();

        System.out.print("Digite o número corespondente a um dos calculos (1, 2 ou 3): ");
        int calculo = entrada.nextInt();

        int resultado = 0;

        switch (calculo) {
            case 1:
                resultado = x*y*z;
                break;
            
            case 2:
                resultado = x+2*y+3*z*6;
                break;
            
            case 3:
                resultado = x+y+z*3;
                break;
        }

        System.out.println("O resultado da operação foi " + resultado);

        entrada.close();
    }
}
