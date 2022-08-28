public class Paciente {
    double peso;
    double altura;

    IMC calculaIMC2(){

        IMC imc = new IMC();

        double indice = peso / (altura*altura);
        imc.indice = indice;

        if (indice < 18.5) {
            imc.abaixoDoPeso = true;
        } else if (indice < 25) {
            imc.pesoIdeal = true;
        } else {
            imc.obeso = true;
            if (indice < 30) {
                imc.grauObesidade = "Acima do peso.";
            } else if (indice < 35) {
                imc.grauObesidade = "Obesidade Grau I";
            } else if (indice < 40) {
                imc.grauObesidade = "Obesidade Grau II";
            } else {
                imc.grauObesidade = "Obesidade Grau III";
            }
        }
    return imc;
    }

    double calculaIMC(){
        double indice = peso / (altura*altura);

        if (indice < 18.5) {
            System.out.println("Está abaixo do peso.");
        } else if (indice < 25) {
            System.out.println("Está no peso ideal.");
        } else {
            System.out.print("Está obeso. ");
            if (indice < 30) {
                System.out.println("Acima do peso.");
            } else if (indice < 35) {
                System.out.println("Obesidade Grau I");
            } else if (indice < 40) {
                System.out.println("Obesidade Grau II");
            } else {
                System.out.println("Obesidade Grau III");
            }
        }
    return indice;
    }
}
