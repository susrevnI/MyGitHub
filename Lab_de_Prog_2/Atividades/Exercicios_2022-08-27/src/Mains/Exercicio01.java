package Mains;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;*/
import java.util.Scanner;

/**
 * Problema “Pagamento”
 * <p>
 * - Fazer um programa para ler o nome de um(a) funcionário(a), o valor que
 * ele(a) recebe por hora, e a quantidade de horas trabalhadas por ele(a).
 * Ao final, mostrar o valor do pagamento do funcionário com uma mensagem
 * explicativa.
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
         * Character[] verificar = new Character[]{'n','N'};
         * 
         * List<Character> verificar2 = Arrays.asList(verificar);
         */

        System.out.println(
                "\nOlá usuário, esse programa vai calcular o valor do salário de um(a) funcionário(a) com base nas horas trabalhadas por ele(a).");

        while (true) {
            System.out.print("\nDigite o nome do(a) funcionário(a): ");
            String nome = scan.nextLine();
            // String nome = scan.nextLine().trim(); O uso do método .trim() poderia ser
            // utilizado para retirar os espaços do inicio e fim da String

            System.out.print("Digite o valor do salário por hora: ");
            double valorHora = scan.nextDouble();

            System.out.print("Digite as horas trabalhadas: ");
            double horas = scan.nextDouble();

            System.out.printf("\nO funcionario %s deve receber R$%.2f.\n", nome, valorHora * horas);

            System.out.print("\nDeseja calcular o pagamento novamente? (s/n): ");
            char cont = scan.next().charAt(0);

            while (cont != 's' && cont != 'S' && cont != 'n' && cont != 'N') {
                System.out.print("\nDigite 's' ou 'n': ");
                cont = scan.next().charAt(0);
            }

            /*
             * if (verificar2.contains(cont)){
             * break;
             * }
             */

            if (cont == 'n' || cont == 'N') {
                break;
            }
        }

        scan.close();
    }
}