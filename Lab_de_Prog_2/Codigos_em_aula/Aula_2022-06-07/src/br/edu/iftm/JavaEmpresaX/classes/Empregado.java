package br.edu.iftm.JavaEmpresaX.classes;

import java.util.Date;

public class Empregado {

    private int codEmp;
    private  String nome;
    private Date dataNasc;
    private String endereco;
    private char sexo;
    private double salario;
    private  int codSuperv;
    private  int codDepto;
    private Departamento deparatamento;

    public Empregado() {
    }

    public Empregado(int codEmp, String nome, Date dataNasc, String endereco,
                     char sexo, double salario, int codSuperv, int codDepto,
                     Departamento deparatamento) {
        this.codEmp = codEmp;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.sexo = sexo;
        this.salario = salario;
        this.codSuperv = codSuperv;
        this.codDepto = codDepto;
        this.deparatamento = deparatamento;
    }

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodSuperv() {
        return codSuperv;
    }

    public void setCodSuperv(int codSuperv) {
        this.codSuperv = codSuperv;
    }

    public int getCodDepto() {
        return codDepto;
    }

    public void setCodDepto(int codDepto) {
        this.codDepto = codDepto;
    }

    public Departamento getDeparatamento() {
        return deparatamento;
    }

    public void setDeparatamento(Departamento deparatamento) {
        this.deparatamento = deparatamento;
    }

    @Override
    public String toString() {
        return "Empregado {" +
                "\n     codEmp = " + codEmp +
                ",\n     nome = '" + nome + '\'' +
                ",\n     dataNasc = " + dataNasc +
                ",\n     endereco = '" + endereco + '\'' +
                ",\n     sexo = " + sexo +
                ",\n     salario = " + salario +
                ",\n     codSuperv = " + codSuperv +
                ",\n     codDepto = " + codDepto +
                ",\n     deparatamento = " + deparatamento +
                '}';
    }
}
