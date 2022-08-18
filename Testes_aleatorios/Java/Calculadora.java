import java.util.Scanner;

/**
 * Calculadora
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner etr = new Scanner(System.in);

        System.out.print("Quantos numeros na equação: ");
        int nEqua = etr.nextInt();

        double[] vetorNm = new double[nEqua];
        char[] vetorOp = new char[nEqua - 1];

        for (int i = 0; i < vetorNm.length; i++) {
            System.out.print("Digite um numero: ");
            vetorNm[i] = etr.nextDouble();

            if (!(i == vetorNm.length-1)){
                System.out.print("Digite uma operação: ");
                vetorOp[i] = etr.next().charAt(0);
            }

        }

        double resultado = vetorNm[0];

        for (int i = 0; i < vetorOp.length; i++) {
            char op = vetorOp[i];

            switch(op){
                case '+':
                    resultado += vetorNm[i+1]; 
                    break;
                case '-':
                    resultado -= vetorNm[i+1];
                    break;
                case '*':
                    resultado *= vetorNm[i+1];
                    break;
                case '/':
                    resultado /= vetorNm[i+1];
                    break;
            }

        }

        System.out.println("O resultado é " + resultado);
    }
}