package Classes;

/**
 * ConversorMoedas
 */
public class ClasseEx09 {

    public static double dolarParaReal(double valorDolar, double totalDolares) {

        totalDolares += totalDolares / 100 * 6;
        double totalReais = valorDolar * totalDolares;

        return totalReais;
    }

}