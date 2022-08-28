package Mains;

import java.util.Scanner;

import Classes.ClasseEx08;

/**
 * Problema “Funcionarios”
 * <p>
 * - Fazer um programa para ler os dados de um funcionário (nome, salário bruto
 * e imposto). Em seguida, mostrar os dados do funcionário (nome e salário
 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
 * mostrar novamente os dados do funcionário. Não se esqueça de gerar os métodos
 * construtores da classe, métodos get/set para cada atributo e realizar o uso
 * de modificar de acesso.
 */
public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "\nOlá usuário, esse programa lê os dados informados de um funcionário e depois executa métodos da classe.");

        System.out.print("\nDigite o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scan.nextDouble();

        System.out.print("Digite o imposto: ");
        double imposto = scan.nextDouble();

        ClasseEx08 funcionario = new ClasseEx08(nome, salarioBruto, imposto);

        System.out.printf("\nFuncionário: %s, salário líquido: R$ %.2f\n\n", funcionario.getNome(),
                funcionario.BuscasSalarioLiquido());

        System.out.print("Qual a porcentagem para aumentar o salário: ");
        double porcentagem = scan.nextDouble();

        funcionario.AumentarSalario(porcentagem);

        scan.close();
    }
}