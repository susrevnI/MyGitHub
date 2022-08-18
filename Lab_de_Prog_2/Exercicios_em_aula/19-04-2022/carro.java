public class carro {
    
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    float valorDeMercado;
    boolean flex;
    String tipoCombustivel;
    proprietario dono;

    float retornaValorDeMercado() {
        return valorDeMercado;
    }

    void alteraModeloECor(String modelo, String cor) {
        if (this.modelo != null) {
            this.modelo = modelo;
        }
        if (this.cor != null) {
            this.cor = cor;
        }
    }

    void ligar() {
        System.out.println("Ligando o carro");
    }
}
