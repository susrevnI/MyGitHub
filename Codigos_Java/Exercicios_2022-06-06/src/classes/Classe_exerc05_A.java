package classes;

public class Classe_exerc05_A {
    private Classe_exerc05_B[] lista = new Classe_exerc05_B[20];

    public int tamanhoLista(){return lista.length;}

    public Classe_exerc05_B poscEsp(int posicao){return lista[posicao-1];}

    public boolean cheioTF() {
        boolean cheia = true;
        for (Classe_exerc05_B classe_exerc05_b : lista) {
            cheia = classe_exerc05_b != null;
        }
        return cheia;
    }

    public void listar(String nome, String numero) {
        boolean repetido = false;
        Classe_exerc05_B contato = new Classe_exerc05_B(nome, numero);

        for (Classe_exerc05_B i : lista) {
            repetido = i == contato;
        }

        if (!repetido) {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] == null) {
                    lista[i] = contato;
                    System.out.println("\nContato adicionado.");
                    i = lista.length;
                }
            }
        } else {
            System.out.println("\nContato já existente.");
        }
    }

    public void buscarPosc(int posicao) {
        if (lista[posicao - 1] != null) {
            System.out.printf("\nContato [%d] = %s\n", posicao, lista[posicao - 1].toString());
        } else {
            System.out.println("\nNão há nenhum contato nesta posição.");
        }
    }

    public void buscarNome(String nome) {
        int repeticoes = 0;
        System.out.println();
        for (Classe_exerc05_B nomes : lista) {
            if (nomes != null && nomes.getNome().contains(nome)) {
                System.out.println(nomes);
                repeticoes++;
            }
        }
        if (repeticoes == 0) {
            System.out.println("Não há ninguem com esse nome.");
        } else {
            System.out.printf("\n%d nome(s) parecido(s) encontrado(s).\n", repeticoes);
        }
    }

    public void buscarNum(String numero) {
        int repeticoes = 0;
        System.out.println();
        for (Classe_exerc05_B numeros : lista) {
            if (numeros != null && numeros.getNumero().contains(numero)) {
                System.out.println(numeros);
                repeticoes++;
            }
        }
        if (repeticoes == 0) {
            System.out.println("Não há ninguem com esse número.");
        } else {
            System.out.printf("\n%d número(s) parecido(s) encontrado(s).\n", repeticoes);
        }
    }

    public void deletar(int posicao) {
        if (lista[posicao - 1] != null) {
            lista[posicao - 1] = null;
            System.out.println("\nContato deletado.");
        } else {
            System.out.println("\nNão há nenhum contato nesta posição.");
        }
    }

    public void editar(int posicao, String nome, String numero){
        lista[posicao-1] = new Classe_exerc05_B(nome, numero);
    }

    public boolean todosContatos() {
        int repeticoes = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.printf("\nContato [%d] = (%s)", i + 1, lista[i]);
                repeticoes++;
            }
        }
        if (repeticoes == 0) {
            System.out.println("\nSem contatos na agenda.");
            return false;
        } else {
            System.out.println();
            return true;
        }
    }
}
