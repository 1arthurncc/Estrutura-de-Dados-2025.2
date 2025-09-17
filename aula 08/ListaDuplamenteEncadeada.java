public class ListaDuplamenteEncadeada {
    private Nodo inicio;
    private Nodo ultimo;

    private class Nodo {
        Integer dado;
        Nodo anterior, proximo;
    }

    ListaDuplamenteEncadeada() {
        inicio = ultimo = null;
    }

    void insereInicio(Integer valor) {
        Nodo novo = new Nodo();
        novo.dado = valor;
        novo.anterior = null;

        if (inicio == null) {
            inicio = ultimo = novo;
            novo.proximo = null;
        }

        else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    Integer removeInicio(){
        if (inicio == null) return null;
        Integer temp = inicio.dado;
        if (inicio == ultimo){
            inicio = ultimo = null;
        }
        else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        return temp;
    }

    void insereUltimo(Integer valor){
        Nodo novo = new Nodo();
        novo.dado = valor;
        novo.proximo = null;

        if (inicio == null){
            inicio = ultimo = novo;
            novo.anterior = null;
        }
        else {
            novo.anterior = ultimo;
            ultimo.proximo = novo;
            ultimo = novo;
        }

    }

    void imprimelista(){
        for (Nodo temp = inicio; temp != null; temp = temp.proximo){
            System.out.print(temp.dado + "->" );
        }     
    System.out.println();
    }

}