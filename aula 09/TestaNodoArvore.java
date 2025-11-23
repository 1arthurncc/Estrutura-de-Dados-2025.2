public class TestaNodoArvore {

    public static void main(String[] args){
    
        ArvoreAVL a = new ArvoreAVL();
        a.insereNodo(10);
        a.insereNodo(15);
        a.insereNodo(13);

        a.imprimePre();
 
        a.insereNodo(17);
        a.imprimePre();

        a.removeNodo(10);

        a.imprimePre();
        
 
    }
    
}