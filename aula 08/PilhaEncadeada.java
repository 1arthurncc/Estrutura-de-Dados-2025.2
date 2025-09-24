public class PilhaEncadeada {
    private ListaDuplamenteEncadeada lista;

    PilhaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }

    void empilhar(Integer valor){
        lista.insereUltimo(valor);
    }

    void desempilhar(){
        lista.removeUltimo();
    }

    void imprimePilha(){
        lista.imprimelista();
    }
}
