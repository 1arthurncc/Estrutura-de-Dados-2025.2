public class TestaNodoArvore {

    public static void main(String[] args){
    
          ArvoreBinaria arv = new ArvoreBinaria();
          arv.insereNodo(28);
          arv.insereNodo(25);
          arv.insereNodo(30);
          arv.insereNodo(23);
          arv.insereNodo(26);
          
          arv.removeNodo(28);
          arv.imprimePre(null);

          System.out.println("altura= " + arv.altura());
     //   NodoArvore a = new NodoArvore(28, null, null);
        
    //    a = a.insere(a, 25);
    //    a = a.insere(a, 30);
        
        
    //    a.imprimePre(a);
//        System.out.println();

  //      a.imprimeSimetrico(a);
    //    System.out.println();
        
        
        //NodoArvore a2 = new NodoArvore(29, null, null);
        //NodoArvore a4 = new NodoArvore(30, a1, a2);

        //NodoArvore a3 = new NodoArvore(70, null, null);
       // NodoArvore a5 = new NodoArvore(60, null, a3);
        
      //  NodoArvore a6 = new NodoArvore(50, a4, a5);
        
      //  a6.imprimePre(a6);

        
    }
    
}