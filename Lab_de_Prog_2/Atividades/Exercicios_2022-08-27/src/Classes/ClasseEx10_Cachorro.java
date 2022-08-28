package Classes;

/**
 * SubClasse Cachorro
 */
public class ClasseEx10_Cachorro extends ClasseEx10_Animal {

    public ClasseEx10_Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void caminha() {
        System.out.println("O cachorro está caminhando!!");
    }

    public void late(){
        System.out.println("Au au au. (´w`)");
    }
}
