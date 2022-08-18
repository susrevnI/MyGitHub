import java.util.Scanner;

public class Exercicio_12 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite o número do dia que quer encontrar: ");
        int numDia = entrada.nextInt();

        String dia = "";

        switch (numDia) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sabado";
                break;
        }

        System.out.println("O dai da semana é " + dia);

        entrada.close();
    }
}
