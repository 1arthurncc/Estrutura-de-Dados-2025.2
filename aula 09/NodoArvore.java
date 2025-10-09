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

    NodoArvore remove(NodoArvore atual, Integer v){
        if (atual == null) return null;
        if (v < atual.valor)
            atual.nodoEsquerda = remove(atual.nodoEsquerda, v);
        else if (v > atual.valor)
            atual.nodoDireita = remove(atual.nodoDireita, v);
        else{
            if (atual.nodoEsquerda == null && atual.nodoDireita == null)
                return null;
            else if (atual.nodoDireita == null)
                    return atual.nodoEsquerda;
            else if (atual.nodoEsquerda == null)
                    return atual.nodoDireita;
            else {
                NodoArvore temp = atual.nodoEsquerda;
                while (temp.nodoDireita != null){
                    temp = temp.nodoDireita;
                }

                atual.valor = temp.valor;
                temp.valor = v;
                atual.nodoEsquerda = remove(atual.nodoEsquerda, v);
            }
        }

        return atual;
    }

    int max(int a, int b){
        return a > b ? a: b;
    }

    int altura(NodoArvore a){
        if (a == null)
            return -1;
        else 
            return 1 + max(altura(a.nodoEsquerda), altura(a.nodoDireita));
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