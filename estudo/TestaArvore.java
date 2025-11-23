public class TestaArvore {
    public static void main(String[] args){
       ArvoreBinaria arv = new ArvoreBinaria();

       arv.insereArvore(90);
       arv.insereArvore(80);
       arv.insereArvore(70);
       arv.insereArvore(100);

       System.out.println("ALtura: " + arv.getAltura());

       arv.imprimeSime();
       arv.removeNodo(90);
       arv.imprimeSime();

       System.out.println("ALtura: " + arv.getAltura());
    }
}
