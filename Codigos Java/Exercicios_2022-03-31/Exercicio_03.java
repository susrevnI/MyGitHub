import java.util.Scanner;

public class Exercicio_03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite o primeiro número: ");
        double prim = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double seg = entrada.nextDouble();

        if (prim > seg) {
            System.out.println("O primeiro número é maior.");
        } else if (seg > prim) {
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("Os dois numeros são iguais.");
        }

        entrada.close();
    }
}
