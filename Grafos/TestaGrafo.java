public class TestaGrafo {
    
    public static void main(String[] args){
    
        Grafo g = new Grafo(5);
        g.insereAresta(0, 1);
        g.insereAresta(0, 2);
        g.insereAresta(1, 2);
        g.insereAresta(1, 3);
        g.insereAresta(2, 3);
        g.insereAresta(3, 4);
        
        g.imprime();

    
        
        BuscaProfundidade bp = new BuscaProfundidade(g);
        bp.dfs();
        bp.imprime();
        
        BuscaLargura bl = new BuscaLargura(g);
        bl.busca(0);
        bl.imprimeVetores();
        
        bl.imprimeCaminho(4);
        
    }
    
}