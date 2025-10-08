public class ArvoreBinaria {
    private NodoArvore raiz;

    ArvoreBinaria(){
        this.raiz = null;
    }

    void insereNodo(Integer v){
        if (this.raiz == null)
            this.raiz = new NodoArvore(v, raiz, raiz);
        else    
            this.raiz = this.raiz.insere(this.raiz, v);
    }

    void removeNodo(Integer v){
        if (this.raiz != null)
           this.raiz = this.raiz.remove(this.raiz, v);
    }

    void imprimePre(Integer v){
        this.raiz.imprimePre(raiz);
    }
    void imprimeSimetrico(Integer v){
        this.raiz.imprimeSimetrico(raiz);
    }
    void imprimePos(Integer v){
        this.raiz.imprimePre(raiz);
    }
}
