package superClasse;

public class Animal {

    protected double peso;
    protected int idade;
    protected int numeroMenbro;

    public Animal(double peso, int idade, int numeroMenbro) {
        this.peso = peso;
        this.idade = idade;
        this.numeroMenbro = numeroMenbro;
    }

    public void locomover(){
        System.out.println("Metodo 'locomover' da classe animal.");
    }

    public void alimentar(){
        System.out.println("Metodo 'alimentar' da classe animal.");
    }

    public void emitirSom(){
        System.out.println("Metodo 'emitirSom' da classe animal.");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroMenbro() {
        return numeroMenbro;
    }

    public void setNumeroMenbro(int numeroMenbro) {
        this.numeroMenbro = numeroMenbro;
    }

}