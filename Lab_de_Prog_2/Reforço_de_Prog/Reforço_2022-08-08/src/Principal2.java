public class Principal2 {

    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de Escritório";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.0;
        double medicao = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("Computador, seu preço é R$ %.2f%n", preco1);
        System.out.printf("Mesa de Escritório, seu preço é R$ %.2f%n", preco2 + 0.5);
        
        System.out.printf("%nRecord: %d anos de idade, código: %d e gênero: %c%n", idade, codigo, genero);
        
        System.out.printf("%nMedição com oito casas decimais: %.8f%n", medicao);
        System.out.printf("Medição com três casas decimais: %.3f", medicao);


        
    }
    
}
