package Classes;

/**
 * SubClasse Gato
 */
public class ClasseEx10_Gato extends ClasseEx10_Animal {

    public ClasseEx10_Gato(String nome, String raca) {
        super(nome, raca);
    }

    public void caminha() {
        System.out.println(this.nome + " está caminhando!!");
    }

    public void mia(){
        System.out.println("Meow meow meow. (UwU)");
    }
    
}