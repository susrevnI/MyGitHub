import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        int opcao = 5;
        Scanner entrada = new Scanner(System.in);
        
        //Contato[] vetorContatos = new Contato[10];
        //int posicao = 0;
        List<Contato> lista = new ArrayList<>();

        do{
            System.out.println("""
                    --- Menu ---
                     1 - Adicionar Contato
                     2 - Buscar Contato por numero
                     3 - Remover Contato por numero
                     4 - Editar Contato
                     5 - Listar Agenda
                     0 - Sair
                    """);
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            int numero = 0;
            String nome = "";
            String email = "";
            String telefone = "";
            boolean encontrou;

            switch(opcao){
                case 0:
                    System.out.println("Cabo!");
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
                    //vetorContatos[posicao] = c;
                    //posicao++;
                    lista.add(c);
                    break;
                    
                case 2:
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

                    break;

                case 3:
                    entrada.nextLine();
                    System.out.print("Digite o nome do cantato: ");
                    nome = entrada.nextLine();

                    encontrou = false;

                    for (Contato contato : lista) {

                        if (nome.equals(contato.getNome())){
                            int j = lista.indexOf(contato);
                            lista.remove(j);
                            encontrou = true;
                        }

                        if (lista.size() == 0){
                            break;
                        }
                    }

                    if (!encontrou){
                        System.out.println("\nContato inexistente.");
                    }

                    break;

                case 4:
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

                            System.out.println("COntato atualizado com sucesso!!");
                        }
                    }

                    if (!encontrou){
                        System.out.println("\nContato inexistente.");
                    }


                    break;

                case 5:
                    
                    for (Contato contato : lista) {
                        System.out.println(contato);
                    }

                    /*for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                    }*/

                    break;

                default:
                    System.out.println("\nOpção invalida, escolha outra opção.");
                    break;
            }

        }while(opcao != 0);

        /*String name = "oisjbvnfdjvwsoisjbvnfdjvwsoisjbvnfdjvwsoisjbvnfdjvwsoisjbvnfdjvws";
        String emai = "oijbvnfdjvwsoisjbvnfdjvwsoisjbvnfdjvwsoisjbvnfdjvwsoisjbvnfdjvws";
        String telefonu = "oisjbvnfdjvwsoisjbvnfjvwsoisjbvnfdjvwsoisjbvnfdjvwsoisjbvnfdjvws";
        int code = 1;
        
        while(true){

            Contato v = new Contato(code, name, emai, telefonu);
            lista.add(v);
            code++;
        }*/

    }
}