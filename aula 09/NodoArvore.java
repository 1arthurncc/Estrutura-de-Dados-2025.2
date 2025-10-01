public class NodoArvore {
    private NodoArvore nodoEsquerda;
    private NodoArvore nodoDireita;
    private Integer valor;

    NodoArvore(Integer valor, NodoArvore esquerda, NodoArvore direita) {
        this.valor = valor;
        this.nodoEsquerda = esquerda;
        this.nodoDireita = direita;
    }

    NodoArvore insere(NodoArvore atual, Integer v){
        if (atual == null)
            atual = new NodoArvore(v, null, null);
        else if (v < atual.valor)
            atual.nodoEsquerda = insere(atual.nodoEsquerda, v);
        else
            atual.nodoDireita = insere(atual.nodoDireita, v);
        return atual;
    }

    void imprimeSimetrico(NodoArvore a){
        if (a != null){
            System.out.print("<");
            imprimeSimetrico(a.nodoEsquerda);
            System.out.print(a.valor);
            imprimeSimetrico(a.nodoDireita);
            System.out.println(">");
        }
    }

    void imprimePre(NodoArvore a){
        if (a != null){
            System.out.print("<");
            System.out.print(a.valor);
            imprimePre(a.nodoEsquerda);
            imprimePre(a.nodoDireita);
            System.out.println(">");
        }
    }

    void imprimePos(NodoArvore a){
        if (a != null){
            System.out.print("<");
            imprimePos(a.nodoEsquerda);
            imprimePos(a.nodoDireita);
            System.out.print(a.valor);
            System.out.println(">");
        }
    }

}