import java.util.Scanner;

public class Exercicio_13 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite um número inteiro para verificar se ele é divisivel por 3 ou 5: ");
        int num = entrada.nextInt();

        if (num %3 == 0 && num %5 == 0) {
            System.out.println("O número é divisivel por 3 e por 5.");
        } else if (num %3 == 0 || num %5 == 0) {
            System.out.println("O número é divisiel por 3 ou por 5.");
        } else {
            System.out.println("O número não é divisivel por 3 nem por 5.");
        }

        entrada.close();
    }
}
