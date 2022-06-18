package classes;

public class Classe_exerc05_B {

    String nome;
    String numero;

    public Classe_exerc05_B(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "; " +
                "Número: " + numero;
    }
}
