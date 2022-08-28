import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        int[][] vetor = new int[2][2];

        Scanner e = new Scanner(System.in);

        vetor[0][0] = 1;
        vetor[0][1] = 2;
        vetor[1][0] = 3;
        vetor[1][1] = 4;

        

        System.out.println(vetor[1][0]);
        System.out.println(vetor[0][0]);
        System.out.println(vetor[1][1]);
        System.out.println(vetor[0][1]);

        List<Integer> lista = new ArrayList<>();

        lista.add(10);

        long a = 500;
        long b = 300;
        long a2 = 0;
        char stop = 'j';

        while(stop != 'o'){
            a = a*b;
            System.out.println(a);
            System.out.println(a2);
            while (a >= 1000000){
                a2++;
                a -= 1000000;
            }
            System.out.println(a);
            System.out.println(a2);
            System.out.printf("%d%6d%n", a2, a);
            stop = e.next().charAt(0);
        }

        e.close();
    }
}
