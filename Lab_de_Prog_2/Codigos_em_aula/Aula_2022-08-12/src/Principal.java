import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        int opcao = -1;
        Scanner entrada = new Scanner(System.in);
        List<Contato> lista = new ArrayList<>();

        do{

            int numero = 0;
            String nome = "";
            String email = "";
            String telefone = "";
            boolean encontrou = false;

            opcao = Principal.menu(entrada, opcao);
        
            switch(opcao){
                case 0:
                    System.out.println("Cabo!");
                    break;

                case 1:
                    Principal.adicionaContato(entrada, lista, numero, nome, email, telefone);
                    break;
                    
                case 2:
                    Principal.encontraContato(entrada, lista, nome, encontrou);
                    break;

                case 3:
                    Principal.removerContato(entrada, lista, nome, encontrou);
                    break;

                case 4:
                    Principal.editarContato(entrada, lista, encontrou, numero, nome, email, telefone);
                    break;

                case 5:
                    Principal.listarAgenta(lista);
                    break;

                case 6:
                    System.out.println("O número total de contatos são: " + Contato.numeroDeContas);
                    break;

                default:
                    System.out.println("\nOpção invalida, escolha outra opção.");
                    break;
            }

        }while(opcao != 0);

        entrada.close();
    }

    /**
     * Esse metodo imprime o menu na tela e pede uma opção. Logo após a resposta do usuário ele retorna a opção.
     * 
     * @param entrada
     * @param opcao
     * @return opcao
     */
    public static int menu(Scanner entrada, int opcao){

        System.out.println("""
                    --- Menu ---
                     1 - Adicionar Contato
                     2 - Buscar Contato por numero
                     3 - Remover Contato por numero
                     4 - Editar Contato
                     5 - Listar Agenda
                     0 - Sair
                    Escolha uma opção: """);
        opcao = entrada.nextInt();
        entrada.nextLine();
        return opcao;
    }

    /**
     * Esse metodo cadastra um contato novo e o coloca na lista.
     * 
     * @param entrada
     * @param lista
     * @param numero
     * @param nome
     * @param email
     * @param telefone
     */
    public static void adicionaContato(Scanner entrada, List<Contato> lista, int numero, 
            String nome, String email, String telefone){

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
        //vetorContatos[posicao] = c;
        //posicao++;
        lista.add(c);
        Contato.numeroDeContas++;
    }

    /**
     * Esse metodo encontra um contato pelo nome. Caso não o encontre, emite uma mensagem de contato não encontrado.
     * 
     * @param entrada
     * @param lista
     * @param nome
     * @param encontrou
     */
    public static void encontraContato(Scanner entrada, List<Contato> lista, String nome, boolean encontrou){

        entrada.nextLine();
        System.out.print("Digite o nome do cantato: ");
        nome = entrada.nextLine();

        encontrou = false;

        for (Contato contato : lista) {
            if (nome.equals(contato.getNome())){
                System.out.println(contato);
                encontrou = true;
            }
        }

        if (!encontrou){
            System.out.println("\nContato inexistente.");
        }
    }

    /**
     * Esse metodo remove um contato da lista. Caso não o encontre, emite uma mensagem de contato não encontrado.
     * 
     * @param entrada
     * @param lista
     * @param nome
     * @param encontrou
     */
    public static void removerContato(Scanner entrada, List<Contato> lista, String nome, boolean encontrou){

        entrada.nextLine();
        System.out.print("Digite o nome do cantato: ");
        nome = entrada.nextLine();

        encontrou = false;

        for (Contato contato : lista) {

            if (nome.equals(contato.getNome())){
                int j = lista.indexOf(contato);
                lista.remove(j);
                encontrou = true;
                Contato.numeroDeContas--;
            }

            if (lista.size() == 0){
                break;
            }
        }

        if (!encontrou){
            System.out.println("\nContato inexistente.");
        }
    }

    /**
     * Esse metodo edita um contato ja existente na lista. Caso não o encontre, emite uma mensagem de contato não encontrado.
     * 
     * @param entrada
     * @param lista
     * @param encontrou
     * @param numero
     * @param nome
     * @param email
     * @param telefone
     */
    public static void editarContato(Scanner entrada, List<Contato> lista,boolean encontrou, 
            int numero, String nome, String email, String telefone){

        entrada.nextLine();
        System.out.print("Digite o nome do cantato: ");
        nome = entrada.nextLine();

        encontrou = false;

        for (Contato contato : lista) {
            if (nome.equals(contato.getNome())){

                int posicaoContato = lista.indexOf(contato);
                
                System.out.print("Digite um número: ");
                numero = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Digite um nome: ");
                nome = entrada.nextLine();
                System.out.print("Digite um email: ");
                email = entrada.nextLine();
                System.out.print("Digite um telefone: ");
                telefone = entrada.nextLine();

                contato = new Contato(numero, nome, email, telefone);

                lista.set(posicaoContato, contato);

                encontrou = true;

                System.out.println("Contato atualizado com sucesso!!");
            }
        }

        if (!encontrou){
            System.out.println("\nContato inexistente.");
        }
    }

    /**
     * Esse metodo imprime toda a lista na tela.
     * 
     * @param lista
     */
    public static void listarAgenta(List<Contato> lista){
        for (Contato contato : lista) {
            System.out.println(contato);
        }
    }
}
