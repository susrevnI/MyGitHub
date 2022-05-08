import java.util.Scanner;

public class Exercicio_B14 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite o valor 'a' da equação do 2 gral: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor 'b': ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor 'c': ");
        double c = entrada.nextDouble();

        double delta = b*b - 4*a*c;

        if (delta < 0) {
            System.out.println("Delta menor que zero, não existe raiz.");
        } else if (delta == 0) {
            double x1 = -b / 2*a;
            System.out.println("Delta igual a zero, raiz unica igual a " + x1);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / 2*a;
            double x2 = (-b - Math.sqrt(delta)) / 2*a;
            System.out.println("Primeira raiz igual a " + x1 + ", segunda raiz igual a " + x2);
        }

        entrada.close();
    }
}
