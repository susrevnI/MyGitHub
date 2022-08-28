package br.edu.iftm.rpgjava.classes;
public class Arqueiro {

    private String nome;
    private int forca;
    private int destreza;
    private int agilidade;
    private int inteligencia;
    private int carisma;
    private int resistencia;
    private int vida;
    private int estamina;
    private int sorte;
    private int mana;

    public Arqueiro() {
    }

    public Arqueiro(String nome, int forca, int destreza, int agilidade, int inteligencia, int carisma, 
            int resistencia,int vida, int estamina, int sorte, int mana) {
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.resistencia = resistencia;
        this.vida = vida;
        this.estamina = estamina;
        this.sorte = sorte;
        this.mana = mana;
    }

    int atacar(int valorDado) {
        int valorAtaque = 0;
        if (valorDado < 2) {
            System.out.println("O ataque falhou!!!");
        } else {
            valorAtaque = this.destreza + valorDado;
            System.out.println("Seu ataque tem " + valorAtaque
             + " de poder!!!");
        }
        return valorAtaque;
    }

    void defender(int valorAtaque) {
        if (valorAtaque <= this.resistencia) {
            System.out.println("O ataque foi defendido!!!");
        } else {
            int danoCausado = valorAtaque - this.resistencia;
            System.out.println("O ataque causou " + danoCausado 
            + " de dano!!!");
            this.vida -= danoCausado;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}

