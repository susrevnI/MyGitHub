import java.util.Scanner;

public class Exercicio_A1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite um número inteiro: ");
        int num = entrada.nextInt();

        int Ant = num - 1;
        int Suc = num + 1;

        System.out.println("O antecessor de " + num + " é " + Ant + " e o sucessor é " + Suc);
        
    }
}