public class TestaNodoArvore{
    public static void main(String[] args){
        NodoArvore a1 = new NodoArvore(28, null, null);
        NodoArvore a2 = new NodoArvore(29, null, null);
        NodoArvore a4 = new NodoArvore(30, a1, a2);

        NodoArvore a3 = new NodoArvore(70, null, null);
        NodoArvore a5 = new NodoArvore(60, null, a3);

        NodoArvore a6 = new NodoArvore(50, a4, a5);

        a6.imprimePre(a6);
    }
}