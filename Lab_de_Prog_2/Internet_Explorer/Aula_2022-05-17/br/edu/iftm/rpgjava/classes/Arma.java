package br.edu.iftm.rpgjava.classes;

public class Arma {
    private String nome;
    private int dano;
    private int durabilidade;


    // metodo construtor
    public Arma() {
    }

    public Arma(String nome, int dano, int durabilidade) {
        this.nome = nome;
        this.dano = dano;
        this.durabilidade = durabilidade;
    }


    // metodos de clase
    public int calculaAtaque(int danoPersonaguem){
        return this.dano + danoPersonaguem;
}

    public void diminuiDurabilidade(int defesa){
        this.durabilidade -= defesa;
    }

    public boolean temDurabilidade(){
        if (durabilidade>0){
            return true;
        } else{
            return false;
        }
    }


    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
}
