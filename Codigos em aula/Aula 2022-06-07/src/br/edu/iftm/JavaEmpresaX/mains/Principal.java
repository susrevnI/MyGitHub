package br.edu.iftm.JavaEmpresaX.mains;

import br.edu.iftm.JavaEmpresaX.classes.Departamento;
import br.edu.iftm.JavaEmpresaX.classes.Empregado;
import br.edu.iftm.JavaEmpresaX.classes.Projeto;

import javax.sound.midi.Soundbank;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        /*Empregado empregado01 = new Empregado();

        empregado01.setCodEmp(1);
        empregado01.setNome("Mariana");
        empregado01.setSexo('F');

        Date dataInicio = new Date();

        Departamento d = new Departamento(1,"Pesquisa", 1, dataInicio);
        empregado01.setDeparatamento(d);

        Projeto p01 = new Projeto(1,"Transmogrifador", d);

        System.out.println(empregado01);
        System.out.println(p01);*/

        Scanner teclado = new Scanner(System.in);

        Projeto[] vetorDeProjetos = new Projeto[5];
        Empregado[] vetorDeEmpregados = new Empregado[10];
        Departamento[] vetorDeDepartamento = new Departamento[5];
        Projeto p;
        Empregado e;
        Departamento d;
        int countProjetos = 0;
        int countDepartamentos = 0;
        int countEmpregados = 0;
        int cadastrar = 0;

        Date data = new Date();

        int opcao = 0;
        do {
            System.out.println("""
                                        
                    1 - Projeto
                    2 - Empregado
                    3 - Departamento
                    """);
            System.out.print("O que deseja visualizar: ");
            cadastrar = teclado.nextInt();

            switch (cadastrar) {

                // ----------   Projeto ----------
                case 1 -> {
                    System.out.println("""
                                                        
                            Menu
                            1 - Cadastrar Projetos
                            2 - Imprimir Todos os Projetos
                            0 - Sair
                            """);
                    System.out.print("Digite uma opção:");
                    opcao = teclado.nextInt();
                    switch (opcao) {
                        case 1:
                            if (countProjetos < 5) {
                                System.out.print("Digite o codigo do Projeto: ");
                                int codigo = teclado.nextInt();
                                System.out.print("digite o nome do projeto: ");
                                String nome = teclado.next();
                                vetorDeProjetos[countProjetos] = new Projeto(codigo, nome, null);
                                countProjetos++;
                            } else {
                                System.out.println("Lista de projetos cheio.");
                            }
                            break;
                        case 2:
                            for (Projeto projeto : vetorDeProjetos) {
                                if (projeto != null) {
                                    System.out.println(projeto);
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Qual o codigo do projeto: ");
                            int cod = teclado.nextInt();
                            for (int i = 0; i < vetorDeProjetos.length; i++) {
                                if (vetorDeProjetos[i] != null) {
                                    if (vetorDeProjetos[i].getCodProj() == cod) {
                                        System.out.println(vetorDeProjetos[i]);
                                        i = vetorDeProjetos.length;
                                    }
                                } else if (i == vetorDeProjetos.length - 1) {
                                    System.out.println("Não há projeto com esse codigo.");
                                }
                            }
                            break;
                    }
                }
                case 2 -> {
                    System.out.println("""
                                                
                            Menu
                            1 - Cadastrar Empregado
                            2 - Imprimir Todos os Empregados
                            0 - Sair
                            """);
                    System.out.print("Digite uma opção:");
                    opcao = teclado.nextInt();
                    switch (opcao) {
                        case 1:
                            if (countEmpregados < 10) {
                                System.out.print("Digite o codigo do Empregado: ");
                                int codigo = teclado.nextInt();
                                System.out.print("Digite o nome do Empregado: ");
                                String nome = teclado.next();
                                //System.out.print("Digite o data de nascimento do Empregado: ");
                                //Date dataNasc = teclado.next
                                System.out.print("Digite o endereço do Empregado: ");
                                String endereco = teclado.next();
                                System.out.print("Digite o sexo do Empregado: ");
                                char sexo = teclado.next().charAt(0);
                                System.out.print("Digite o salario do Empregado: ");
                                double salario = teclado.nextDouble();
                                /*System.out.println("Digite o codigo do supervisor do Empregado: ");
                                int codSuperv = teclado.nextInt();
                                System.out.println("Digite o codigo do departamento do Empregado: ");
                                int codDepto = teclado.nextInt();*/
                                vetorDeEmpregados[countEmpregados] = new Empregado(codigo, nome, new Date(), endereco, sexo, salario, countEmpregados + 1, countEmpregados + 1, null);
                                countEmpregados++;
                            } else {
                                System.out.println("Lista de empregados cheio.");
                            }
                            break;
                        case 2:
                            for (Empregado empregado : vetorDeEmpregados) {
                                if (empregado != null) {
                                    System.out.println(empregado);
                                }
                            }
                            break;

                    }
                }
                case 3 -> {
                    System.out.println("""
                                                
                            Menu
                            1 - Cadastrar Departamento
                            2 - Imprimir Todos os Departamento
                            0 - Sair
                            """);
                    System.out.print("Digite uma opção:");
                    opcao = teclado.nextInt();
                    switch (opcao) {
                        case 1:
                            if (countDepartamentos < 5) {
                                System.out.print("Digite o codigo do Departamento: ");
                                int codigo = teclado.nextInt();
                                System.out.print("Digite o nome do Departamento: ");
                                String nome = teclado.next();
                                System.out.print("Digite o codigo do departamento do Empregado: ");
                                int codDepto = teclado.nextInt();
                                vetorDeDepartamento[countDepartamentos] = new Departamento(codigo, nome, codDepto, new Date());
                                countDepartamentos++;
                            } else {
                                System.out.println("Lista de departamentos cheio.");
                            }
                            break;
                        case 2:
                            for (Departamento departamento : vetorDeDepartamento) {
                                if (departamento != null) {
                                    System.out.println(departamento);
                                }
                            }
                            break;

                    }
                }
            }

        } while (opcao != 0);


    }

}

