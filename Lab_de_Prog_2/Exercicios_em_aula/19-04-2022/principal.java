public class principal {
    
    public static void main(String[] args) {
        
        proprietario dono = new proprietario();
        dono.nome = "João da Silva";
        dono.cpf = "111111111111";
        dono.endereco = "rua 20, numero 660";
        dono.bairro = "Centro";
        dono.cidade = "Ituiutaba";

        carro meuCarro = new carro();
        meuCarro.fabricante = "FIAT";
        meuCarro.modelo = "Uno";
        meuCarro.anoFabricacao = 2009;
        meuCarro.cor = "Vermelho";
        meuCarro.flex = true;
        meuCarro.tipoCombustivel = "Gasolina e Álcool";
        meuCarro.dono = dono;
        meuCarro.valorDeMercado = 10000f;

        meuCarro.ligar();
        meuCarro.alteraModeloECor("Fusca", "Azul");
        float valor = meuCarro.retornaValorDeMercado();
        System.out.println("Valor do carro: R$" + valor);

        carro seuCarro = new carro();
        seuCarro.fabricante = "FIAT";
        seuCarro.modelo = "Uno";
        seuCarro.anoFabricacao = 2009;
        seuCarro.cor = "Vermelho";
        seuCarro.dono = dono;

        System.out.println(meuCarro.dono.nome);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.cor);
    }
}
