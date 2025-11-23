public class BuscaProfundidade{
    private static final int BRANCO = 0;
    private static final int CINZA  = 1;
    private static final int PRETO  = 2;
       
    private  int cor[], dist[], pai[], f[], tempo;
    private Grafo g; 
    
    BuscaProfundidade(Grafo g){
        tempo = 0;
        this.g = g;
        cor =  new int[g.getV()];
        dist = new int[g.getV()];
        pai  = new int[g.getV()];
        f =   new int[g.getV()];
    }    
    
    void imprime(){
    
        System.out.println("Cor");
        for (int i = 0; i < g.getV(); i++)
            System.out.print(cor[i] + "|");
        System.out.println();
          
        System.out.println("Pai");
        for (int i = 0; i < g.getV(); i++)
            System.out.print(pai[i] + "|");
        System.out.println();
        
        System.out.println("Distância");
        for (int i = 0; i < g.getV(); i++)
            System.out.print(dist[i] + "|");
        System.out.println();
        
        System.out.println("Tempo global");
        for (int i = 0; i < g.getV(); i++)
            System.out.print(f[i] + "|");
        
        System.out.println();
   }
    
    
    
    void dfs(){
        for (int i = 0; i < g.getV(); i++){
            cor[i] = BRANCO; 
            dist[i] = -1; 
            pai[i] = -1;
            f[i] = -1;
        }
        tempo = 0;
        for (int i = 0; i < g.getV(); i++)
            if (cor[i] == BRANCO)
                dfs_visita(i);
    }   

    
    void dfs_visita(int u){
        cor[u] = CINZA;
        tempo++;
        dist[u] = tempo;
        
        for (int v = 0; v < g.getV(); v++)
            if (this.g.adjacente(u, v))
                if (cor[v] == BRANCO){
                    pai[v] = u;
                    dfs_visita(v);
                }
        cor[u] = PRETO;
        //tempo++;
       // f[u] = tempo;
        f[u] = tempo = tempo + 1; 
    }
}