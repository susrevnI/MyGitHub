public class Principal2 {
    
    public static void main(String[] args) {
        Paciente p = new Paciente();
        p.altura = 1.77;
        p.peso = 90;
        // double imc = p.calculaIMC();
        // System.out.println("O valor do IMC: " + imc);

        IMC imc = p.calculaIMC2();
        System.out.println(imc);
    }
}
