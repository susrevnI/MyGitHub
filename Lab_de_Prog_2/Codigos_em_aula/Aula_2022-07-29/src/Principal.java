import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        int opcao = 5;
        Scanner entrada = new Scanner(System.in);
        int numero;
        String nome;
        String email;
        String telefone;
        Contato[] vetorContatos = new Contato[5];
        

        do{
            System.out.println("""
                    --- Menu ---
                     1 - Adicionar Contato
                     2 - Buscar Contato por numero
                     3 - Remover Contato por numero
                     4 - Editar Contato
                     0 - Sair
                    """);
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();


            switch(opcao){
                case 0:
                    System.out.println("FIm do programa!");
                    break;

                case 1:
                    System.out.print("Digite um número: ");
                    numero = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Digite um nome: ");
                    nome = entrada.nextLine();
                    System.out.print("Digite um email: ");
                    email = entrada.nextLine();
                    System.out.print("Digite um telefone: ");
                    telefone = entrada.nextLine();

                    Contato c = new Contato(numero,nome,email,telefone);
                    break;
                    
                default:
                    System.out.println("Opção invalida, escolha outra opção.");
                    break;
            }

        }while(opcao != 0);

    }
}