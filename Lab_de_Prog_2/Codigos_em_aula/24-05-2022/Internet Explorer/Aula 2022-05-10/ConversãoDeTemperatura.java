public class ConversãoDeTemperatura {
    
    float celsius;
    char converterPara;
    float graus;

    float conversãoFK(){
        switch (converterPara) {
        case 'F':
            graus = (celsius * 9/5) + 32;
            System.out.println("A conversão foi de " + graus + " Fahrenheit.");
            break;
        case 'K':
            graus = celsius + 273.15f;
            System.out.println("A conversão foi de " + graus + " Kelvin.");
            break;
        }
        return graus;
    }
}