package Classes;
public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public Aluno(){}

    public Aluno(String nome, int idade, char sexo, String matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
        
    }


    public void cancelarMatricula(){
        System.out.println("Sua matricula foi cancelada.");
        this.curso = "";
        this.matricula = "";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
