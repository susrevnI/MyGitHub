package Classes;

/**
 * Funcionário
 */
public class ClasseEx08 {

    private String nome;
    private double salarioBruto;
    private double imposto;

    public ClasseEx08() {}

    public ClasseEx08(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double BuscasSalarioLiquido() {
        return salarioBruto - imposto;
    }

    public void AumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
        System.out.printf("\nDados atualizados: %s, R$ %.2f\n", nome, salarioBruto - imposto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

}
