public class ListaDuplamenteEncadeada {
    private Nodo inicio;
    private Nodo fim;

    private class Nodo {
        Integer dado;
        Nodo prox;
        Nodo ant;
    }

    public void ListaDuplamenteEncadeada() {
        inicio = fim = null;
    }

    boolean listaVazia(){
        return inicio == null;
    }

    public void insereInicio(Integer valor) {
        Nodo novo = new Nodo();
        novo.dado = valor;
        novo.ant = null;
        novo.prox = inicio;

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        }
        else {
            inicio.ant = novo;
            inicio = novo;
        }

    }

    public void insereFinal(Integer valor){
        Nodo novo = new Nodo();
        novo.dado = valor;
        novo.prox = null;

        if (inicio == null){
            novo.ant = fim;
            inicio = fim = novo;
        }
        else {
            novo.ant = fim;
            fim.prox = novo;
            fim = novo;
        }
    }

    public void imprime() {
        for (Nodo temp = inicio; temp != null; temp = temp.prox)
            System.out.print(temp.dado + "->");
        System.out.println();
    }    

    public void imprimeInverso() {
        for (Nodo temp = fim; temp != null; temp = temp.ant)
            System.out.print(temp.dado + "->");
        System.out.println();
    }

    public Integer removeInicio() {
        if (inicio == null) return null;

        Integer aux = inicio.dado;
        if (inicio == fim)  
            inicio = fim = null;
        else {
            inicio.prox.ant = null;
            inicio = inicio.prox;
        }
        return aux;
        
    }

    public Integer removeFinal(){
        if (inicio == null) return null;

        Integer aux = fim.dado;
        if (inicio == fim)
            inicio = fim = null;
        else{    
            fim.ant.prox = null;
            fim = fim.ant;
        }
        return aux;
    }
}
