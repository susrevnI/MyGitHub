package P;

public class Ex2Calc {
    
    public static double soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }
    public static double subtacao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        return resultado;

    }
    public static double multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        return resultado;
    }
    public static double divisao(double numero1, double numero2){
        if(numero2 != 0){
            double resultado = numero1 / numero2;
            return resultado;
        }else{
            return 0;
        }
        
    }
    public static double porcentagem(double numero, double porcentagem){
        double resultado = numero * porcentagem/100;
        return resultado;
    }
    public static double mod(double numero1, double numero2){
        double resultado = numero1 % numero2;
        return resultado;
    }
    public static double raizquadrada(double numero){
        double resultado = Math.sqrt(numero);
        return resultado;

    }
    public static double potencia(double numero1, double numero2){
        double resultado = Math.pow(numero1, numero2);
        return resultado;
    }
}
