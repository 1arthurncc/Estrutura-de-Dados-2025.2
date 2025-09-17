//ARQUIVO ListaEncadeada.java 

public class ListaEncadeada {
    String nome;
    private Nodo inicio;

    // A classe interna Nodo permanece a mesma
    private class Nodo {
        Integer dado;
        Nodo prox; // proximo
    }

    // O construtor permanece o mesmo
    public ListaEncadeada() {
        inicio = null;
    }

    /**
     * Insere um novo valor no início da lista.
     * @param valor O valor a ser inserido.
     */
    public void insereNodo(Integer valor) {
        Nodo novo = new Nodo();
        novo.dado = valor;
        novo.prox = inicio;
        inicio = novo;
    }

    /**
     * Remove o primeiro elemento da lista.
     * @return O valor do elemento removido, or null se a lista estiver vazia.
     */
    public Integer removeInicio() {
        if (inicio == null) {
            return null;
        }
        Integer temp = inicio.dado;
        inicio = inicio.prox;
        return temp;
    }

    void insereOrdenado(Integer n){
        Nodo temp = inicio;
        Nodo anterior = null;

        while (temp != null && temp.dado < n){
            anterior = temp;
            temp = temp.prox;
        }
        Nodo novo = new Nodo();
        novo.dado = n;

        if (anterior == null){
            novo.prox = inicio;
            inicio = novo;
        }
        else{
            anterior.prox = novo;
            novo.prox = temp;
        }
    }

    /**
     * Remove um nó com um valor específico da lista.
     * @param valor O valor a ser removido.
     * @return O valor do nó removido, ou null se o valor não for encontrado.
     */
    public Integer removeNodo(Integer valor) {
        Nodo atual = inicio;
        Nodo anterior = null;

        // 1. Procura o nó, usando .equals() para comparação e && para segurança
        while (atual != null && !atual.dado.equals(valor)) {
            anterior = atual;
            atual = atual.prox;
        }

        // 2. Se atual é nulo, o valor não foi encontrado na lista
        if (atual == null) {
            return null;
        }

        // 3. Guarda o dado que será retornado
        Integer dadoRemovido = atual.dado;

        // 4. Verifica se o nó a ser removido é o primeiro da lista
        if (anterior == null) {
            // Se for, o início da lista passa a ser o próximo do nó removido
            inicio = atual.prox;
        } else {
            // Se não for, o anterior aponta para o próximo do nó removido, "pulando-o"
            anterior.prox = atual.prox;
        }

        return dadoRemovido;
    }

    /**
     * Imprime todos os elementos da lista no console.
     */
    public void imprimeLista() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        
        System.out.print("Lista: ");
        for (Nodo temp = inicio; temp != null; temp = temp.prox) {
            System.out.print(temp.dado + " -> ");
        }
        System.out.println("null"); // Indica o fim da lista
    }
}