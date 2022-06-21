package classes;

public class Classe_exerc08 {

    private int valorCont;

    public void contar(char comand) {
        switch (comand) {
            case '+' -> {
                valorCont++;
                System.out.println("\n   Valor do contador: " + valorCont);
            }
            case '-' -> {
                valorCont--;
                System.out.println("\n   Valor do contador: " + valorCont);
            }
            case '*' -> {
                valorCont = 0;
                System.out.println("\n   Contador zerado!");
            }
        }
    }
}
