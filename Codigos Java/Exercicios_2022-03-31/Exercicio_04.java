import java.util.Scanner;

public class Exercicio_04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite o seu salario: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite a pretação do emprestimo: ");
        double prestacao = entrada.nextDouble();

        double calculo = salario / 100 * 20;

        if (prestacao > calculo) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }

        entrada.close();
    }
}
