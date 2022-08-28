import Classes.Aluno;
import Classes.Pedagoga;
import Classes.Professor;

public class Principal {
    
    public static void main(String[] args) {
        Aluno a = new Aluno("Pedro", 17, 'M', "12345678", "Tecnico em Informática");

        Professor p = new Professor("André", 36, 'M', "Programação", 100000);

        Pedagoga pe = new Pedagoga("Maria", 25, 'F', "Setor Pedagogico", "Tecnico em Informática");

        a.fazerAniversario();
        p.fazerAniversario();
        System.out.println("Salario do professor é " + p.getSalario());
        p.receberAum();
        System.out.println("Salario do professor é " + p.getSalario());
        pe.fazerAniversario();
        pe.mudarTrabalho("Tecnico em Quimica");
        System.out.println(pe.getTrabalhando());

    }
}
