import java.util.Scanner;

public class Exercicio_B2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite o primeiro número da operação: ");
        double prim = entrada.nextDouble();

        System.out.print("Digite a operação (+, -, * ou /): ");
        String operacao = entrada.next();
        //char operacao = entrada.next().charAt(0);

        System.out.print("Digite o segundo número da operação: ");
        double seg = entrada.nextDouble();

        double resultado = 0;
        
        switch (operacao) {
            case "+" : // ou case '+':
                resultado = prim + seg;
                break;

            case "-": // ou case '-':
                resultado = prim - seg;
                break;

            case "*": // ou case '*':
                resultado = prim * seg;
                break;

            case "/": // ou case '/':
                if (seg != 0) {
                    resultado = prim / 0;
                }
                break;
        }

        if (seg != 0){
            System.out.println("O resultado da operação é " + resultado);
        } else {
            System.out.println("Não pode dividir por 0.");
        }

        entrada.close();
    }
}