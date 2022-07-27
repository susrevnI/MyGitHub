package Classes;

public class ClasseEx2_Contato {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;

    public ClasseEx2_Contato(int codigo, String nome, String telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Contato:" +
                "\n  Codigo: " + codigo +
                "\n  Nome: " + nome +
                "\n  Telefone: " + telefone +
                "\n  Email: " + email;

    }
}
