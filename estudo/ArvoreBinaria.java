public class ArvoreBinaria {
    private NodoArvore raiz;

    ArvoreBinaria(){
        raiz = null;
    }

    void imprimePre(){
        raiz.imprimePre(raiz);
    }

    void imprimeSime(){
        raiz.imprimeSime(raiz);
    }

    void imprimePos(){
        raiz.imprimePos(raiz);
    }

    void insereArvore(int valor){
        if (raiz == null)
            raiz = new NodoArvore(valor, null, null); 
        else
            raiz.insere(raiz, valor);
    }

    void removeNodo(int valor){
        if (raiz != null)
            raiz.removeNodo(raiz, valor);
    }

    int getAltura(){
        return raiz.altura(raiz);
    }
}
