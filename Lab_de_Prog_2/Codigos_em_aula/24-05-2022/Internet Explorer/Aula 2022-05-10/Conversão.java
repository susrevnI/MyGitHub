public class Conversão {
    float celsius;
    char qual;
    float graus;

    int x;

    float conversãoFK(){
        if (qual == 'F' || qual == 'f') {
            x = 1;
        } else if (qual == 'K' || qual == 'f') {
            x = 0;
        }

        switch (x) {
        case 1:
            graus = (celsius * 9/5) + 32;
            System.out.println("A conversão foi de " + graus + " Fahrenheit.");
            break;
        case 0:
            graus = celsius + 273.15f;
            System.out.println("A conversão foi de " + graus + " Kelvin.");
            break;
        }
        return graus;
    }
}