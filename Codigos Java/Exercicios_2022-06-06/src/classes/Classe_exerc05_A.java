package classes;

public class Classe_exerc05_A {
    public String[] lista = new String[20];

    public void listar(String nome, String numero) {
        int posicao = 0;
        boolean ok = true;
        String cheio = lista[posicao];

        while (cheio != null) {
            posicao++;
            cheio = lista[posicao];
            if (posicao > 19) {
                ok = false;
            }
        }

        if (ok) {
            lista[posicao] = "Posição = " + (posicao + 1) + "; " + nome + numero;
        } else {
            System.out.println("Agenda cheia");
        }
    }

    public String getLista(int posicao) {
        return lista[posicao-1];
    }


}
