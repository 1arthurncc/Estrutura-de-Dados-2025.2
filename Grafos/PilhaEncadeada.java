public class PilhaEncadeada {
    private ListaDuplamenteEncadeada lista;

    PilhaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }

    boolean vazia(){
        return lista.listaVazia();
    }

    void empilhar(Integer valor){
        lista.insereFinal(valor);
    }

    Integer desempilhar(){
        return lista.removeFinal();
    }

    void imprimePilha(){
        lista.imprime();
    }
}
