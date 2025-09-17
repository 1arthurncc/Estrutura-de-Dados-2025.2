public class TestaFila {
    public static void main(String[] args) {
        FilaInteiros fila = new FilaInteiros(5);

        fila.insereFinal(5);
        fila.insereFinal(15);
        fila.insereFinal(20);
        fila.insereFinal(25);
        fila.insereFinal(40);
        fila.imprimeFila();
        System.out.println("Removeu " + fila.removeInicio());
        System.out.println("Removeu " + fila.removeInicio());

        fila.insereFinal(44);
        fila.imprimeFila();
    }
}
