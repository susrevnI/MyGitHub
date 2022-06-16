package classes;

public class Classe_exerc09 {

    private boolean lampada = false;

    public void onOff(int comand) {
        switch (comand) {
            case 1:
                if (!lampada) {
                    lampada = true;
                    System.out.println("\nLigou a lâmpada.");
                } else {
                    System.out.println("\nA lâmpada já está ligada.");
                }
                break;
            case 0:
                if (lampada) {
                    lampada = false;
                    System.out.println("\nDesligou a lâmpada");
                } else {
                    System.out.println("\nA lâmpada já está desligada.");
                }
                break;
            case 2:
                if (lampada) {
                    System.out.println("\nLâmpada acesa.");
                } else {
                    System.out.println("\nLâmpada apagada.");
                }
                break;
        }
    }
}
