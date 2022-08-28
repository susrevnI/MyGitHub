package Mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.ClasseEx10_Animal;
import Classes.ClasseEx10_Cachorro;
import Classes.ClasseEx10_Gato;

/**
 * Problema Heranca
 * <p>
 * Implemente aplicando herança do diagramas de classe abaixo:
 * 
 * <p>
 * <b>--------------- Imagens de diagramas ---------------</b>
 * 
 * <p>
 * Após implementar as classes descritas acima, faça uma classe chamada
 * hotelPet, e essa classe deve implementar o método main. Dentro do método main
 * crie uma lista do tipo animal que irá receber todos os animais que estiverem
 * hospedados no nosso hotel para pets.
 * Faça um menu com duas opções: check-in do pet, e check-out do pet e sair.
 * 
 * <p>
 * A opção check-in pet deve pedir os dados do animal que pode ser um cachorro
 * ou um gato, o programa deve gerar o seu respectivo objeto( ou seja se for um
 * cachorro deve se criar um objeto da classe Cachorro, se for um gato deve
 * gerar um objeto da classe Gato), reproduzir o som do animal (cachorro late e
 * o gato mia), e adicionar o objeto na nossa lista do tipo animal.
 * 
 * <p>
 * A opção check-out deve perguntar qual animal se deseja buscar, realizar a
 * busca do animal na lista pelo nome, se caso o programa encontre algum objeto,
 * deve removê-lo da lista. Após remover o animal da lista, mostrar uma mensagem
 * na tela falando o nome do animal e agradecendo pela estadia (exemplo: Até
 * mais ‘nomeDoPet’, volte sempre!). Se a busca retornar vazia, apresentar uma
 * mensagem dizendo hóspede pet não encontrado.
 * 
 * <p>
 * A opção sair encerra o programa.
 * 
 */
public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<ClasseEx10_Animal> listaAnimais = new ArrayList<>();

        System.out.println("\n  ---  |Olá usuário, bem-vindo ao Fofos HotelPet|  ----");

        // Crindo  e outras variáveis
        double opcao = -1;
        double opcaoPet = -1;
        String nomePetIn;
        String racaPetIn;
        String nomePetOut;
        boolean encontrou;

        do {
            // Menu
            System.out.print("""

                    Opções:
                     1 - Check-In do Pet
                     2 - Check-Out do Pet
                     0 - Sair do programa

                    Digite uma opção:\s""");
            opcao = scan.nextDouble();

            // Verificando se opcao é valida
            if (opcao == (int) opcao) {

                switch ((int) opcao) {

                    // Caso 1 - Check-In
                    case 1:

                        System.out.print("\nDeseja fazer o check-in de um cachorro(1) ou gato(2)? ");
                        opcaoPet = scan.nextDouble();

                        // Verificando opcaoPet
                        if (opcaoPet == 1 || opcaoPet == 2) {

                            scan.nextLine();
                            System.out.print("\nDigite o nome do pet: ");
                            nomePetIn = scan.nextLine();

                            System.out.print("Digite a raça do pet: ");
                            racaPetIn = scan.nextLine();

                            // Caso opcaoPet seja cachorro
                            if (opcaoPet == 1) {

                                ClasseEx10_Cachorro cachorro = new ClasseEx10_Cachorro(nomePetIn, racaPetIn);
                                cachorro.late();
                                listaAnimais.add(cachorro);

                            // Caso opcaoPet seja gato
                            } else {

                                ClasseEx10_Gato gato = new ClasseEx10_Gato(nomePetIn, racaPetIn);
                                gato.mia();
                                listaAnimais.add(gato);

                            }

                        // Caso opcaoPet seja invalida
                        } else {
                            System.out.println("\nOpção invalida. Faça o check-in novamente.");
                        }
                        break;

                    case 2:

                        scan.nextLine();
                        System.out.print("\nDigite o nome do animal para fazer o check-out: ");
                        nomePetOut = scan.nextLine();
                        encontrou = false;

                        for (ClasseEx10_Animal animal : listaAnimais) {
                            if (animal.getNome().equals(nomePetOut)){
                                listaAnimais.remove(animal);
                                encontrou = true;
                                break;
                            }
                        }

                        if (encontrou) {
                            System.out.printf("\nAté mais %s, volte sempre!\n", nomePetOut);
                        } else {
                            System.out.println("\nPet não encontrado, procure novamente.");
                        }

                        break;

                    case 0:
                        System.out.println("\n\nFim do programa, até mais.\n");
                        break;
                    
                    // Caso a opcao não exista
                    default:
                        System.out.println("\nOpção inexistente. Digite novamente.");
                        break;
                }
            
            // Caso opcao seja invalida
            } else {
                System.out.println("\nOpção invalida. Digite novamente.");
            }

        } while (opcao != 0);

        scan.close();
    }
}