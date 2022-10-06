package testes;

import erros.Matematica;

public class MatematicaErroTeste {
    public static void main(String[] args) {
        Matematica m = new Matematica();
        try {
            m.divisao(5, 0);
        } catch (Exception e) {
            System.out.println("Houve um Erro: ");
            e.printStackTrace();
        }

        System.out.println("Mensagem após o erro.");
    }
}
