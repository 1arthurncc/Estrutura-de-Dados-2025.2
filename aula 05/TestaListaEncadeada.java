// ARQUIVO TestaListaEncadeada.java

public class TestaListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

       lista.insereNodo(5);
       lista.insereNodo(25);
       lista.insereNodo(55);
       lista.imprimeLista();

       lista.removeNodo(55);
       lista.imprimeLista();

       lista.removeInicio();
       lista.imprimeLista();
    }
}