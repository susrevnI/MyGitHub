import java.util.Scanner;

public class Exercicio_B1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite o nome do produto: ");
        String nome = entrada.next();
        
        System.out.print("Digite o modelo do produto: ");
        String modelo = entrada.next();

        System.out.print("Digite o tamanho do produto: ");
        float tamanho = entrada.nextFloat();

        System.out.print("Digite o preço do produto: ");
        double preco = entrada.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quant = entrada.nextInt();

        System.out.println("\nA tabela do seu produto ficou assim:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quant + " unidades");

        entrada.close();
    }
}