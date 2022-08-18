package br.edu.iftm.JavaEmpresaX.classes;

public class Projeto {

    private int codProj;
    private String titulo;
    private  Departamento departamento;

    public Projeto() {
    }

    public Projeto(int codProj, String titulo, Departamento departamento) {
        this.codProj = codProj;
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public int getCodProj() {
        return codProj;
    }

    public void setCodProj(int codProj) {
        this.codProj = codProj;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "codProj=" + codProj +
                ", titulo='" + titulo + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}
