public class IMC {

    double indice;
    boolean abaixoDoPeso;
    boolean pesoIdeal;
    boolean obeso;
    String grauObesidade;

    @Override
    public String toString() {
        return "IMC \n[abaixoDoPeso = " + abaixoDoPeso + ", \ngrauObesidade = " + grauObesidade + ", \nindice = " + indice
                + ", \nobeso = " + obeso + ", \npesoIdeal = " + pesoIdeal + "]";
    }

}
