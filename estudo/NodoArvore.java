public class NodoArvore{
    private NodoArvore esq;
    private int valor;
    private NodoArvore dir;

    NodoArvore(){
    }

    NodoArvore(int valor, NodoArvore esq, NodoArvore dir){
        this.valor = valor;
        this.esq = esq;
        this.dir = dir;
    }

    NodoArvore insere(NodoArvore atual, int valor){
        if (atual == null)
            atual = new NodoArvore(valor, null, null);
        else if (valor < atual.valor)
            atual.esq = insere(atual.esq, valor);
        else 
            atual.dir = insere(atual.dir, valor);

        return atual;
    }

    NodoArvore removeNodo(NodoArvore atual, int valor){
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

            NodoArvore temp = atual.esq;
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

    int altura(NodoArvore atual){
        if (atual == null) return -1;
        else {
            return 1 + max(altura(atual.esq), altura(atual.dir));
        }
    }


    boolean buscaArvore(NodoArvore arv, int valor){
        if (arv == null) return false;
        else 
            if (arv.valor == valor) return true;
            else return buscaArvore(arv.esq, valor) || buscaArvore(arv.dir, valor);
    }

    public void imprimePre(NodoArvore arv){
        if (arv != null){
            System.out.print("<");
            System.out.print(arv.valor);
            imprimePos(arv.esq);
            imprimePos(arv.dir);
            System.out.print(">");
        }
    }

    public void imprimeSime(NodoArvore arv){
        if (arv != null){
            System.out.print("<");
            imprimeSime(arv.esq);
            System.out.print(arv.valor);
            imprimeSime(arv.dir);
            System.out.print(">");
        }
    }

    public void imprimePos(NodoArvore arv){
        if (arv != null){
            System.out.print("<");
            imprimePos(arv.esq);
            imprimePos(arv.dir);
            System.out.print(arv.valor);
            System.out.print(">");
        }
    }

}
