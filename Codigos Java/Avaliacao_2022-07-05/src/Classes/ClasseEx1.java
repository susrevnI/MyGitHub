package Classes;

public class ClasseEx1 {

    public void fatorar(int num){
        int resultado = 1;

        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }

        System.out.println("O fatorial é " + resultado);
    }
}
