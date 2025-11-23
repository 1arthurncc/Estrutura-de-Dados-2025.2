public class ArvoreAVL {
    private NodoAVL raiz;

    ArvoreAVL(){
        this.raiz = null;
    }

    void insereNodo(Integer v){
        if (this.raiz == null)
            this.raiz = new NodoAVL(v, raiz, raiz);
        else    
            this.raiz = this.raiz.insereBalanceado(this.raiz, v);
    }

    void removeNodo(Integer v){
        if (this.raiz != null)
           this.raiz = this.raiz.remove(this.raiz, v);
    }

    int altura(){
        if (this.raiz == null)
            return -1;
        else;
            return this.raiz.altura(raiz);
    }

    void imprimePre(){
        this.raiz.imprimePre(raiz);
        System.out.println();
    }
    void imprimeSimetrico(){
        this.raiz.imprimeSimetrico(raiz);
        System.out.println();
    }
    void imprimePos(){
        this.raiz.imprimePre(raiz);
        System.out.println();
    }
}
