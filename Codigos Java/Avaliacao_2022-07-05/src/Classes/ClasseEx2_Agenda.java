package Classes;

import java.util.Arrays;

public class ClasseEx2_Agenda {
    ClasseEx2_Contato[] contato;

    public ClasseEx2_Agenda() {
    }

    public ClasseEx2_Agenda(ClasseEx2_Contato[] contato) {
        this.contato = contato;
    }

    public void iniciarAgenda(int num) {
        if (contato == null) {
            contato = new ClasseEx2_Contato[num];

            System.out.println("\nAgenda criada.");
        } else {
            System.out.println("\nA agenda ja foi criada.");
        }
    }

    public boolean cheia() {
        for (ClasseEx2_Contato elemento : contato) {
            if (elemento == null) {
                return false;
            }
        }
        return true;
    }

    public boolean verificar(int codigo){
        for (ClasseEx2_Contato elemento:contato) {
            if (elemento != null && elemento.getCodigo() == codigo){
                return true;
            }
        }
        return false;
    }

    public void adicionar(String nome, String telefone, String email) {
        for (int i = 0; i < contato.length; i++) {
            if (contato[i] == null) {
                contato[i] = new ClasseEx2_Contato(i+1, nome, telefone, email);
                i = contato.length;
            }
        }
    }

    public void buscar(int codigo){
        boolean j = false;
        for (ClasseEx2_Contato elemento:contato) {
            if (elemento != null && elemento.getCodigo() == codigo){
                System.out.println(elemento);
                j = true;
            }
        }

        if (!j){
            System.out.println("\nNenhum contato emcontrado.");
        }
    }

    public void remover(int codigo){
        boolean j = false;
        for (int i = 0; i < contato.length; i++){
            if (contato[i] != null && contato[i].getCodigo() == codigo){
                contato[i] = null;
                j = true;
                System.out.println("\nContato deletado.");
            }
        }

        if (!j){
            System.out.println("\nNão há contato com esse codigo.");
        }
    }

    public void editar(int codigo, String nome, String telefone, String email){
        for (int i = 0; i < contato.length; i++) {
            if (contato[i] != null && contato[i].getCodigo() == codigo){
                contato[i] = new ClasseEx2_Contato(codigo,nome,telefone,email);
            }
        }
    }

    public ClasseEx2_Contato[] getContato() {
        return contato;
    }

    public void setContato(ClasseEx2_Contato[] contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "ClasseEx2_Agenda{" +
                "contato=" + Arrays.toString(contato) +
                '}';
    }
}
