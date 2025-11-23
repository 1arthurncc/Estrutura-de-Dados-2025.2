public class NodoAVL {
    private NodoAVL nodoEsquerda;
    private NodoAVL nodoDireita;
    private Integer valor;

    NodoAVL(Integer valor, NodoAVL esquerda, NodoAVL direita) {
        this.valor = valor;
        this.nodoEsquerda = esquerda;
        this.nodoDireita = direita;
    }

    NodoAVL insere(NodoAVL atual, Integer v){
        if (atual == null)
            atual = new NodoAVL(v, null, null);
        else if (v < atual.valor)
            atual.nodoEsquerda = insere(atual.nodoEsquerda, v);
        else
            atual.nodoDireita = insere(atual.nodoDireita, v);
        return atual;
    }

    NodoAVL insereBalanceado(NodoAVL a, int valor){
        if (a == null)
            a = new NodoAVL(valor, null, null);
        else if (valor < a.valor){
            a.nodoEsquerda = insereBalanceado(a.nodoEsquerda, valor);

            if (altura(a.nodoEsquerda) - altura(a.nodoDireita) == 2){
                if (valor < a.nodoEsquerda.valor)
                    a = rotaDireita(a);
                else    
                    a = rotaEsquerdaDireita(a);
            }
        }
        else{
            a.nodoDireita = insereBalanceado(a.nodoDireita, valor);
            if (altura(a.nodoEsquerda) - altura(a.nodoDireita) == -2){
                if (valor > a.nodoDireita.valor)
                    a = rotaEsquerda(a);
                else    
                    a = rotaDireitaEsquerda(a);
            }
        }
        return a;
    }

    NodoAVL remove(NodoAVL atual, Integer v){
        if (atual == null) return null;
        if (v < atual.valor){
            atual.nodoEsquerda = remove(atual.nodoEsquerda, v);
            if (altura(atual.nodoEsquerda) - altura(atual.nodoDireita) == -2)
                if (altura(atual.nodoDireita.nodoEsquerda) -
                    altura(atual.nodoDireita.nodoDireita) == -1)
                    atual = rotaEsquerda(atual);
                else    
                    atual = rotaDireitaEsquerda(atual);
        }
        else if (v > atual.valor)
            atual.nodoDireita = remove(atual.nodoDireita, v);
            if (altura(atual.nodoEsquerda) - altura(atual.nodoDireita) == 2){
                if (altura(atual.nodoEsquerda.nodoEsquerda) - 
                    altura(atual.nodoEsquerda.nodoDireita) == 1)
                    atual = rotaDireita(atual);
                else    
                    atual = rotaEsquerdaDireita(atual);
            }
        else{
            if (atual.nodoEsquerda == null && atual.nodoDireita == null)
                return null;
            else if (atual.nodoDireita == null)
                    return atual.nodoEsquerda;
            else if (atual.nodoEsquerda == null)
                    return atual.nodoDireita;
            else {
                NodoAVL temp = atual.nodoEsquerda;
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

    int altura(NodoAVL a){
        if (a == null)
            return -1;
        else 
            return 1 + max(altura(a.nodoEsquerda), altura(a.nodoDireita));
    }

    void imprimeSimetrico(NodoAVL a){
        if (a != null){
            System.out.print("<");
            imprimeSimetrico(a.nodoEsquerda);
            System.out.print(a.valor);
            imprimeSimetrico(a.nodoDireita);
            System.out.print(">");
        }
    }

    void imprimePre(NodoAVL a){
        if (a != null){
            System.out.print("<");
            System.out.print(a.valor);
            imprimePre(a.nodoEsquerda);
            imprimePre(a.nodoDireita);
            System.out.print(">");
        }
    }

    void imprimePos(NodoAVL a){
        if (a != null){
            System.out.print("<");
            imprimePos(a.nodoEsquerda);
            imprimePos(a.nodoDireita);
            System.out.print(a.valor);
            System.out.print(">");
        }
    }

    NodoAVL rotaEsquerdaDireita(NodoAVL atual){
        atual.nodoEsquerda = rotaEsquerda(atual.nodoEsquerda);
        atual = rotaDireita(atual);
        return atual;
    }

    NodoAVL rotaDireitaEsquerda(NodoAVL atual){
        atual.nodoDireita = rotaDireita(atual.nodoDireita);
        atual = rotaEsquerda(atual);
        return atual;
    }

    NodoAVL rotaEsquerda(NodoAVL atual){
        NodoAVL temp = atual.nodoDireita;
        atual.nodoDireita = temp.nodoEsquerda;
        temp.nodoEsquerda = atual;
        return temp;
    }

    NodoAVL rotaDireita(NodoAVL atual){
        NodoAVL temp = atual.nodoEsquerda;
        atual.nodoEsquerda = temp.nodoDireita;
        temp.nodoDireita = atual;
        return temp;
    }

}