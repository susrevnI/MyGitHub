package testes;

import erros.ControleRemoto;

public class ControleRemotoErroTeste {

    public static void main(String[] args) {
        
        ControleRemoto controle = new ControleRemoto();

        try {
            controle.desligarTV();
            controle.ligarTV();
            controle.ligarTV();
            controle.desativarMudo();
            controle.ativarMudo();
            controle.ativarMudo();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.desativarMudo();
            controle.desligarTV();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Fim do programa");
        
    }
}
