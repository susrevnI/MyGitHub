package RevisaoClasses.Mains;

import RevisaoClasses.Classes.ArCondicionado;

public class Principal {
    public static void main(String[] args) {

//        ArCondicionado objeto = new ArCondicionado("Um que funcione", 18,
//                1, true, false, 0);
        ArCondicionado objeto = new ArCondicionado("Um que funcione", 18);

        System.out.println(objeto.getModelo());

        objeto.setModelo("Fujitsu");

        System.out.println(objeto.getModelo());

    }
}
