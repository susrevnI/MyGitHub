import java.util.Scanner;

public class Exercicio_08 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite a idade do nadador: ");
        int idade = entrada.nextInt();

        if (idade < 5) {
            System.out.println("Muito novo para a clasificação.");
        } else if (idade <= 7) {
            System.out.println("Nadador Infantil A");
        } else if (idade <= 10) {
            System.out.println("Nadador Infantil B");
        } else if (idade <= 13) {
            System.out.println("Nadador Juvenil A");
        } else if (idade <= 17) {
            System.out.println("Nadador Juvenil B");
        } else {
            System.out.println("Nadador Sênior");
        }

        entrada.close();
    }
}
