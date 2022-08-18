package br.edu.iftm.JavaEmpresaX.classes;

import java.util.Date;

public class Departamento {

    private  int codDepto;
    private String nome;
    private  int gerente;
    private Date dataGerente;

    public Departamento() {
    }

    public Departamento(int codDepto, String nome, int gerente, Date dataGerente) {
        this.codDepto = codDepto;
        this.nome = nome;
        this.gerente = gerente;
        this.dataGerente = dataGerente;
    }

    public int getCodDepto() {
        return codDepto;
    }

    public int returnCod(){return codDepto;}

    public void setCodDepto(int codDepto) {
        this.codDepto = codDepto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGerente() {
        return gerente;
    }

    public void setGerente(int gerente) {
        this.gerente = gerente;
    }

    public Date getDataGerente() {
        return dataGerente;
    }

    public void setDataGerente(Date dataGerente) {
        this.dataGerente = dataGerente;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "\n      codDepto = " + codDepto +
                ",\n      nome = '" + nome + '\'' +
                ",\n      gerente = " + gerente +
                ",\n      dataGerente = " + dataGerente +
                '}';
    }
}
