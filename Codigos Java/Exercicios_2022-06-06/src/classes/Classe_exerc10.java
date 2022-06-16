package classes;

public class Classe_exerc10 {

    private String nome;
    private String numConta;
    private double saldo;

    public Classe_exerc10(){}

    public Classe_exerc10(String nome, String numConta, double saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("Seu saldo é de R$ " + saldo);
    }

    public void sacar(double saque){
        saldo -= saque;
        System.out.println("Seu saldo é de R$ " + saldo);
    }

    public void visializar() {
        System.out.printf("""
                
                Dados da conta:
                  Nome: %s
                  Codigo da conta: %s
                  Saldo atual: %s
                """,nome,numConta,saldo);
    }

    public String getNome() {
        return nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
