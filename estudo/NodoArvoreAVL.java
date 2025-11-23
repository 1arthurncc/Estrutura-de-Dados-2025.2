public class NodoArvoreAVL{
    private NodoArvoreAVL esq;
    private int valor;
    private NodoArvoreAVL dir;

    NodoArvoreAVL(){
    }

    NodoArvoreAVL(int valor, NodoArvoreAVL esq, NodoArvoreAVL dir){
        this.valor = valor;
        this.esq = esq;
        this.dir = dir;
    }

    NodoArvoreAVL insere(NodoArvoreAVL atual, int valor){
        if (atual == null)
            atual = new NodoArvoreAVL(valor, null, null);
        else if (valor < atual.valor)
            atual.esq = insere(atual.esq, valor);
        else 
            atual.dir = insere(atual.dir, valor);

        return atual;
    }

    NodoArvoreAVL removeNodo(NodoArvoreAVL atual, int valor){
        if (atual == null) return null;

        else if (valor < atual.valor)
            atual.esq = removeNodo(atual.esq, valor);
        else if (valor > atual.valor)
            atual.dir = removeNodo(atual.dir, valor);

        else {
            if (atual.esq == null && atual.dir == null) 
                return null;
            if (atual.esq == null)
                return atual.dir;
            if (atual.dir == null)
                return atual.esq;

            NodoArvoreAVL temp = atual.esq;
            while (temp.dir != null){
                temp = temp.dir;
            }

            atual.valor = temp.valor;
            temp.valor = valor;
            atual.esq = removeNodo(atual.esq, valor);
        }
        return atual;
    }

    int max(int a, int b){
        if (a > b) return a;
        else return b;
    }

    int altura(NodoArvoreAVL atual){
        if (atual == null) return -1;
        else {
            return 1 + max(altura(atual.esq), altura(atual.dir));
        }
    }


    boolean buscaArvore(NodoArvoreAVL arv, int valor){
        if (arv == null) return false;
        else 
            if (arv.valor == valor) return true;
            else return buscaArvore(arv.esq, valor) || buscaArvore(arv.dir, valor);
    }

    public void imprimePre(NodoArvoreAVL arv){
        if (arv != null){
            System.out.print("<");
            System.out.print(arv.valor);
            imprimePos(arv.esq);
            imprimePos(arv.dir);
            System.out.print(">");
        }
    }

    public void imprimeSime(NodoArvoreAVL arv){
        if (arv != null){
            System.out.print("<");
            imprimeSime(arv.esq);
            System.out.print(arv.valor);
            imprimeSime(arv.dir);
            System.out.print(">");
        }
    }

    public void imprimePos(NodoArvoreAVL arv){
        if (arv != null){
            System.out.print("<");
            imprimePos(arv.esq);
            imprimePos(arv.dir);
            System.out.print(arv.valor);
            System.out.print(">");
        }
    }

    NodoArvoreAVL rotaDir(NodoArvoreAVL a){
        NodoArvoreAVL aux = a.esq;
        a.esq = aux.dir;
        aux.dir = a; 
        return aux;
    }

    NodoArvoreAVL rotaEsq(NodoArvoreAVL a){
        NodoArvoreAVL aux = a.dir;
        a.dir = aux.esq;
        aux.esq = a; 
        return aux;
    }

    NodoArvoreAVL rotaEsqDir(NodoArvoreAVL a){
        a.esq = a.rotaEsq(a.esq);
        a = a.rotaDir(a);
        return a;
    }

    NodoArvoreAVL rotaDirEsq(NodoArvoreAVL a){
        a.dir = a.rotaDir(a.dir);
        a = a.rotaEsq(a);
        return a;
    }

    NodoArvoreAVL insereBalanceado(NodoArvoreAVL a, int valor){
        if (a == null)
            a = new NodoArvoreAVL(valor, null, null);
        else if (valor < a.valor){
            a.esq = insereBalanceado(a.esq, valor);
            if (this.altura(a.esq) - this.altura(a.dir) == 2){
                if (valor < a.esq.valor){
                    a = a.rotaDir(a);
                }
                else {
                    a = a.rotaEsqDir(a);
                } 
            }
        }
        else {
            a.dir = insereBalanceado(a, valor);
            if (this.altura(a.esq) - this.altura(a.dir) == -2){
                if (valor > a.dir.valor){
                    a = a.rotaEsq(a);
                }
                else {
                    a = a.rotaDirEsq(a);
                }
            }
        }
        return a;
    }

}
