package P;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        do{
        System.out.println("1 -Calculadora básica");
        System.out.println("2 -Calculadora cientifica");
        int opcaocalculadora = entrada.nextInt();

        if(opcaocalculadora == 1){
            System.out.println("1- soma");
            System.out.println("2- subtração");
            System.out.println("3- multiplicação");
            System.out.println("4- divisão");
            System.out.println("5- porcentagem");
            System.out.println("0- sair");
            opcao = entrada.nextInt();
        } else if(opcaocalculadora == 2){
            System.out.println("1- soma");
            System.out.println("2- subtração");
            System.out.println("3- multiplicação");
            System.out.println("4- divisão");
            System.out.println("5- porcentagem");
            System.out.println("6- mod");
            System.out.println("7- raiz quadrada");
            System.out.println("8- potencia");
            System.out.println("0- sair");
            opcao = entrada.nextInt();
        }

        double numero1 = 0;
        double numero2 = 0;
        double numero = 0;
        double resultado = 0;

        switch (opcao) {
            case 1:
                System.out.println("Insira o primeiro numero:");
                numero1 = entrada.nextDouble();
                System.out.println("Insira o segundo numero:");
                numero2 = entrada.nextDouble();
                resultado = Ex2Calc.soma(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                System.out.println("Insira o primeiro numero:");
                numero1 = entrada.nextDouble();
                System.out.println("Insira o segundo numero:");
                numero2 = entrada.nextDouble();
                resultado = Ex2Calc.subtacao(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                System.out.println("Insira o primeiro numero:");
                numero1 = entrada.nextDouble();
                System.out.println("Insira o segundo numero:");
                numero2 = entrada.nextDouble();
                resultado = Ex2Calc.multiplicacao(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                System.out.println("Insira o primeiro numero:");
                numero1 = entrada.nextDouble();
                System.out.println("Insira o segundo numero:");
                numero2 = entrada.nextDouble();
                resultado = Ex2Calc.divisao(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 5:
                System.out.println("Insira o primeiro numero:");
                numero1 = entrada.nextDouble();
                System.out.println("Insira o segundo numero:");
                numero2 = entrada.nextDouble();
                resultado = Ex2Calc.porcentagem(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 6:
                System.out.println("Insira o primeiro numero:");
                numero1 = entrada.nextDouble();
                System.out.println("Insira o segundo numero:");
                numero2 = entrada.nextDouble();
                resultado = Ex2Calc.mod(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 7:
                System.out.println("Insira o primeiro numero:");
                numero = entrada.nextDouble();
                resultado = Ex2Calc.raizquadrada(numero);
                System.out.println("Resultado: " + resultado);
                break;
            case 8:
                System.out.println("Insira o primeiro numero:");
                numero1 = entrada.nextDouble();
                System.out.println("Insira o segundo numero:");
                numero2 = entrada.nextDouble();
                resultado = Ex2Calc.potencia(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                break;
        }
    }while(opcao != 0);
    }
}
