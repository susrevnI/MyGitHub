import java.util.Scanner;

public class petShop {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        cachorro meuCachorro = new cachorro();
        
        System.out.print("Digite o nome do cachorro: ");
        meuCachorro.nome = ler.next();
        
        System.out.print("Digite a idade: ");
        meuCachorro.idade = ler.nextInt();

        System.out.print("Digite o sexo: ");
        meuCachorro.sexo = ler.next();
        
        System.out.print("Digite a raça: ");
        meuCachorro.raca = ler.next();

        System.out.println(meuCachorro.nome + "\n" + 
        meuCachorro.idade + "\n" + meuCachorro.raca + "\n" + 
        meuCachorro.sexo);

        ler.close();
    }
}