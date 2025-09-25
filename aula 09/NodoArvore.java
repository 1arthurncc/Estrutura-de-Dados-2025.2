public class NodoArvore {
    private NodoArvore nodoEsquerda;
    private NodoArvore nodoDireita;
    private Integer valor;

    NodoArvore(Integer valor, NodoArvore esquerda, NodoArvore direita) {
        this.valor = valor;
        this.nodoEsquerda = esquerda;
        this.nodoDireita = direita;
    }

    void imprimePre(NodoArvore a){
        if (a != null){
            System.out.print("<");
            System.out.print(a.valor);
            imprimePre(a.nodoEsquerda);
            imprimePre(a.nodoDireita);
            System.out.print(">");
        }
    }

}