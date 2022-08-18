import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite a operação desejada (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        System.out.print("Digite o primeiro numero da operação: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero da operação: ");
        double num2 = entrada.nextDouble();

        double resultado;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("O resultado da operação é " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("O resultado da operação é " + resultado);
                break;
            
            case '*':
                resultado = num1 * num2;
                System.out.println("O resultado da operação é " + resultado);
                break;

            case '/':
                if (num2 == 0){
                    System.out.println("Não pode dividir por 0");
                } else {
                    resultado = num1 / num2;
                    System.out.println("O resultado da operação é " + resultado);
                }
                break;
        }

        entrada.close();
    }
}