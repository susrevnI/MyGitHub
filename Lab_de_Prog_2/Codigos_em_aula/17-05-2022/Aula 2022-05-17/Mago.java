public class Mago {
    
    String nome;
    int forca;
    int destreza;
    int agilidade;
    int inteligencia;
    int carisma;
    int resistencia;
    int vida;
    int estamina;
    int sorte;
    int mana;

    int atacar(int valorDado){
        int valorAtaque = 0;
        if(valorDado < 2){
            System.out.println("O ataque falhou!!!");
        } else{
            valorAtaque = this.inteligencia+valorDado;
            System.out.println("Seu ataque tem " + valorAtaque + " de poder!!!");
        }
        return valorAtaque;
    }

    void defender(int valorAtaque){
        if(valorAtaque <= this.resistencia){
            System.out.println("O ataque foi defendido!!!");
        } else {
            int danoCausado = valorAtaque - this.resistencia;
            System.out.println("O ataque causou " + danoCausado + " de dano!!!");
            this.vida -= danoCausado;
        }
    }
}
