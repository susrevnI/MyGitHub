import java.util.Scanner;

public class Exercicio_09 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá usuário digite a sua altura: ");
        float altura = entrada.nextFloat();

        System.out.print("Digite o seu peso: ");
        float peso = entrada.nextFloat();

        String resultado = "";

        // ALTURA ABAIXO DE 1,20
        if (altura < 1.2) {

            if (peso <= 60) {
                resultado = "A";

            } else if (peso <= 90) {
                resultado = "D";

            } else {
                resultado = "G";
            }

        // ALTURA ENTRE 1,20 E 1,70
        } else if (altura <= 1.7) {

            if (peso <= 60) {
                resultado = "B";

            } else if (peso <= 90) {
                resultado = "E";

            } else {
                resultado = "H";
            }

        // ALTURA ACIMA DE 1,70
        } else {

            if (peso <= 60) {
                resultado = "C";

            } else if (peso <= 90) {
                resultado = "F";

            } else {
                resultado = "I";
            }
        }

        System.out.println("Voce esta no grupo " + resultado);
        
        entrada.close();
    }
}
