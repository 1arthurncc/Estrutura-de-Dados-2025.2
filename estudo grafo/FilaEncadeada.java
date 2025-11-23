public class FilaEncadeada {
    private ListaDuplamenteEncadeada lista;

    FilaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }

    boolean filaVazia(){
        return lista.listaVazia();
    }

    void insereFila(Integer valor){
        lista.insereFinal(valor);
    }

    Integer removeFila(){
        return lista.removeInicio();
    }

    void imprimeFila(){
        lista.imprime();
    }
}
