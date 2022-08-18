import java.util.Scanner;

public class Exercicio_06 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário, digite a sua altuta: ");
        float altura = entrada.nextFloat();

        System.out.print("Digite o seu sexo: ");
        char sexo = entrada.next().charAt(0);

        double pesoIdeal = 0;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.2 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("Seu peso ideal é " + pesoIdeal);
        
        entrada.close();
    }
}
