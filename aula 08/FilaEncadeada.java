public class FilaEncadeada {
    private ListaDuplamenteEncadeada lista;

    FilaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }

    void insereFila(Integer valor){
        lista.insereUltimo(valor);;
    }

    void removeFila(){
        lista.removeInicio();
    }

    void imprimeFila(){
        lista.imprimelista();
    }
}
