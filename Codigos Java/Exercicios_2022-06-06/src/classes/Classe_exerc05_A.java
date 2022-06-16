package classes;

import java.util.Arrays;

public class Classe_exerc05_A {
    public String[] lista = new String[10];

    public void listar(String nome, String numero) {
        //int i = 0;
        //boolean ok = true;
        //String cheio = lista[i];

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = String.valueOf(new Classe_exerc05_B(nome, numero));
                i = lista.length;
            } else if (i == lista.length - 1) {
                System.out.println("Agenda cheia.");
            }
        }

        /*while (cheio != null) {
            i++;
            cheio = lista[i];
            if (i > 19) {
                ok = false;
            }
        }

        if (ok) {
            lista[i] = "Posição = " + (i + 1) + newContact;
        } else {
            System.out.println("Agenda cheia");
        }*/
    }

    public String[] getLista() {
        return lista;
    }

    public void todosContatos() {
        for (String s : lista) {
            if (s != null) {
                System.out.println(s);
            }
        }

        /*for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null){
                System.out.println(lista[i]);
            }
        }*/
    }

    @Override
    public String toString() {
        return "Contatos {" +
                "lista = " + Arrays.toString(lista) +
                '}';
    }
}
