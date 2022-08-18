public class Conversão {
    float celsius;
    char qual;
    float graus;

    float conversãoFK(){
        switch (qual) {
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