package Classes;

/**
 * SuperClasse Animal
 */
public abstract class ClasseEx10_Animal {

    protected String nome;
    protected String raca;

    public ClasseEx10_Animal() {
    }

    public ClasseEx10_Animal(String nome) {
        this.nome = nome;
    }

    public ClasseEx10_Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public abstract void caminha();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
}