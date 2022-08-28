package RevisaoClasses.Classes;

public class ArCondicionado {

    private String modelo;
    private int temperatura;
    private int velocidade;
    private boolean estaLigado;
    private boolean estaOcilando;
    private int timer;

    public ArCondicionado(){}

    public ArCondicionado(String modelo, int temperatura){
        this.modelo = modelo;
        this.temperatura = temperatura;
    }

    public ArCondicionado(String modelo, int temperatura, int velocidade,
                          boolean estaLigado, boolean estaOcilando, int timer) {
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.velocidade = velocidade;
        this.estaLigado = estaLigado;
        this.estaOcilando = estaOcilando;
        this.timer = timer;
    }

    public void ligar(){
        estaLigado = true;
    }

    public void desligar(){
        estaLigado = false;
    }

    public void aumentaTemperatura(){
        temperatura = temperatura + 2;
    }

    public void diminuiTemperatura(){
        temperatura = temperatura - 2;
    }

    public void ligaOcilacao(){
        estaOcilando = true;
    }

    public void desligaOscilacao(){
        estaOcilando = false;
    }

    public void ligarTimer(int tempo){
        timer = tempo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String umOutroModelo){
        modelo = umOutroModelo;
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", velocidade=" + velocidade +
                ", estaLigado=" + estaLigado +
                ", estaOcilando=" + estaOcilando +
                ", timer=" + timer +
                '}';
    }
}
