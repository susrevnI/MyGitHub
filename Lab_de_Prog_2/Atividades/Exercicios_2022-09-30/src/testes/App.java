package testes;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] vetor = null;
        int[] numeros = new int[] {1,2,3,4};
        int[] pesos = new int[]{5,0,4};
 
        System.out.println("Execução antes do erro.");

        try {
            for(int i = 0; i < numeros.length; i++){
                //System.out.println(numeros[i]);
                double resultado = (double)numeros[i] / (double)pesos[i];
                System.out.printf(" %d / %d = %.2f\n", numeros[i], pesos[i], resultado);
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("Houve um erro: velor nulo foi encontrado.");
            System.out.println(nullPointerException.getMessage());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Houve um erro: acesso a posição inexistente do vetor.");
            System.out.println(arrayIndexOutOfBoundsException.getMessage());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Houve um erro de calculo");
            System.out.println(arithmeticException.getMessage());
        }

        System.out.println("Execução depois do erro.");
        

        System.out.println(1/0.0);
    }
}
