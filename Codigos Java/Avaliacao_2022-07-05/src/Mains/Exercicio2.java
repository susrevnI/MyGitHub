package Mains;

import Classes.ClasseEx2_Agenda;
import Classes.ClasseEx2_Contato;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite o tamanho da agenda: ");
        double tamanho = ent.nextDouble();

        while (tamanho != (int)tamanho || tamanho < 1){
            System.out.print("Tamanho invalido, digite novamente: ");
            tamanho = ent.nextDouble();
        }

        ClasseEx2_Agenda agenda = new ClasseEx2_Agenda(new ClasseEx2_Contato[(int)tamanho]);
        int codigo;

        do {
            System.out.println("""
                    
                    Digite um comando:
                      1 - Adiciona um contato;
                      2 - Busca um contato por codigo;
                      3 - Deleta um contato por codigo;
                      4 - Edita o contado que possui o codigo;
                      0 - Sair.""");
            System.out.print("Digite o proximo comando: ");
            codigo = ent.nextInt();

            switch (codigo){
                case 1:
                    if (!agenda.cheia()){
                        ent.nextLine();
                        System.out.print("Digite o nome: ");
                        String nome = ent.nextLine();
                        System.out.print("Digite o telefone: ");
                        String telefone = ent.nextLine();
                        System.out.print("Digite o email: ");
                        String email = ent.nextLine();

                        agenda.adicionar(nome,telefone,email);
                    } else {
                        System.out.println("A agenda está cheia.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o codigo do contato: ");
                    double codb = ent.nextDouble();
                    while (codb != (int)codb || codb < 1){
                        System.out.print("Codigo invalido, digite de novo: ");
                        codb = ent.nextDouble();
                    }
                    agenda.buscar((int) codb);
                    break;
                case 3:
                    System.out.print("Digite o codigo do contato: ");
                    double codr = ent.nextDouble();
                    while (codr != (int)codr || codr < 1){
                        System.out.print("Codigo invalido, digite de novo: ");
                        codr = ent.nextDouble();
                    }
                    agenda.remover((int) codr);
                    break;
                case 4:
                    System.out.print("Digite o codigo do contato: ");
                    double code = ent.nextDouble();
                    while (code != (int)code || code < 1){
                        System.out.print("Codigo invalido, digite de novo: ");
                        code = ent.nextDouble();
                    }

                    if (agenda.verificar((int) code)){
                        ent.nextLine();
                        System.out.print("Digite o nome: ");
                        String nome = ent.nextLine();
                        System.out.print("Digite o telefone: ");
                        String telefone = ent.nextLine();
                        System.out.print("Digite o email: ");
                        String email = ent.nextLine();
                        agenda.editar((int)code,nome,telefone,email);
                    } else {
                        System.out.println("Nenhum contato encontrado.");
                    }
                    break;
            }

        }while (codigo != 0);

    }
}
