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

    Integer removeUltimo(){
        if (inicio == null)
            return null;

        Integer temp = ultimo.dado;
        if (inicio == ultimo){
            inicio = ultimo = null;
        }
        else{
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
        }
        return temp;
    }

    Integer removeNodo(Integer valor){
        Nodo temp = inicio;
        while (temp != null && temp.dado !=valor)
            temp = temp.proximo;

        //Valor não existe
        if (temp == null) return null;
        //Primeiro elemento
        if (temp.anterior == null){
            inicio = temp.proximo;
        }
        else {
            temp.anterior.proximo = temp.proximo;
        }

        if (temp.proximo == null){
            ultimo = temp.anterior;
        }
        else {
            temp.proximo.anterior = temp.anterior;
        }

        return temp.dado;
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