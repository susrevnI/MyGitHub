package erros;

public class ControleRemoto {
    
    private boolean ligada;
    private int volume;
    private boolean mudo;

    public ControleRemoto(){
        this.ligada = false;
        this.volume = 0;
        this.mudo = false;
    }

    public void ligarTV() throws ControleRemotoException{
        if (this.ligada){
            //System.out.println("A TV já está ligada.");
            //Exception excecao = new Exception("A TV já está ligada.");
            //throw excecao;
            throw new ControleRemotoException("A TV já está ligada.");
        } else {
            this.ligada = true;
            System.out.println("A TV ligou.");
        }
    }

    public void desligarTV() throws ControleRemotoException{
        if (!this.ligada){
            //System.out.println("A TV já está desligada.");
            // Exception excecao = new Exception("A TV já está desligada.");
            throw new ControleRemotoException("A TV já está desligada.");
        } else {
            this.ligada = false;
            System.out.println("A TV desligou.");
        }
    }

    public void aumentarVolume() throws ControleRemotoException{
        if (this.volume > 95){
            //System.out.println("O volume está no maximo!");
            //System.out.println("Volume: " + this.volume);
            //Exception excecao = new Exception("O volume está no maximo!");
            throw new ControleRemotoException("O volume está no maximo!");
        } else {
            this.volume += 5;
            System.out.println("Volume: " + this.volume);
        }
    }

    public void diminuirVolume() throws ControleRemotoException{
        if (this.volume < 5){
            //System.out.println("O volume está no minimo!");
            //System.out.println("Volume: " + this.volume);
            //Exception excecao = new Exception("O volume está no minimo!");
            throw new ControleRemotoException("O volume está no minimo!");
        } else {
            this.volume -= 5;
            System.out.println("Volume: " + this.volume);
        }
    }

    public void ativarMudo() throws ControleRemotoException{
        if (this.mudo){
            //System.out.println("A TV já está muda.");
            throw new ControleRemotoException("A TV já está muda.");
        } else {
            this.mudo = true;
            System.out.println("A TV está muda.");
        }
    }

    public void desativarMudo() throws ControleRemotoException{
        if (!this.mudo){
            // System.out.println("A TV já está mutada.");
            throw new ControleRemotoException("A TV já está mutada.");
        } else {
            this.mudo = false;
            System.out.println("A TV não está muda.");
        }
    }
}
