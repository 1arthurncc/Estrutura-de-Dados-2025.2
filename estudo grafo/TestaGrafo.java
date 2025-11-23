public class TestaGrafo {
    public static void main(String[] args){
        Grafo g = new Grafo(5);
        g.adicionaAresta(0, 1);
        g.adicionaAresta(1, 2);
        g.adicionaAresta(1, 3);
        g.adicionaAresta(2, 4);
        g.adicionaAresta(3, 4);
        g.imprime();
        System.out.println();

        BuscaLargura bl = new BuscaLargura(0, g);
        System.out.println(bl);
        bl.busca();
        System.out.println(bl);
       
    }
}
