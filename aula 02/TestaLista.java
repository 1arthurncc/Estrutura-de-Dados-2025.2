public class TestaLista {
    public static void main(String[] args) {
        ListaVetores lista = new ListaVetores(5);
        lista.insere(66);
        lista.insere(77);
        lista.insere(88);
         lista.insere(55);
        lista.insere(22);
        lista.insere(44);
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
        System.out.println(lista.removeFinal());
        lista.imprime();
    }
}
