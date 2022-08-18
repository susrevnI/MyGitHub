import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite sua idade ao final deste ano: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o ano atual: ");
        int ano = entrada.nextInt();

        int nasc = ano - idade;

        System.out.println("Seu ano de nascimento é " + nasc);

        entrada.close();
    }
}