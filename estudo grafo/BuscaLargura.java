public class BuscaLargura {
    private static final int BRANCO = 0;
    private static final int CINZA = 1;
    private static final int PRETO = 2;

    private int pai[];
    private int dist[];
    private int cor[];
    private int origem;
    private Grafo grafo;

    public BuscaLargura(int origem, Grafo g){
        this.grafo = g;
        this.origem = origem;
        cor = new int[grafo.getV()];
        dist = new int[grafo.getV()];
        pai = new int[grafo.getV()];
        for (int i = 0; i < grafo.getV(); i++){
            cor[i] = BRANCO;
            dist[i] = -1;
            pai[i] = -1;
        }
    }

    public void busca(){
        cor[origem] = BRANCO;
        dist[origem] = 0;

        FilaEncadeada fila = new FilaEncadeada();
        fila.insereFila(origem);

        while (!fila.filaVazia()){
            fila.imprimeFila();
            int u = fila.removeFila();
            System.out.println(u);
            for (int v = 0; v < grafo.getV(); v++){
                System.out.println("Arestas" + u + " " + v);
                if (grafo.isAresta(u, v)){
                    System.out.println("Adjascente" + v);
                    if (cor[v] == BRANCO){
                        cor[v] = CINZA;
                        pai[v] = u;
                        dist[v] = dist[u] + 1;
                        fila.insereFila(v);
                    }
                }
            }
            cor[u] = PRETO;
        }
    }

    @Override
    public String toString() {
        String linha = "";

        linha += "-----Cores-----";
        for (int i = 0; i < grafo.getV(); i++) {
            linha += " | " + cor[i];
        }

        linha += "\n-----Distância-----";
        for (int i = 0; i < grafo.getV(); i++) {
            linha += " | " + dist[i];
        }

        linha += "\n-----Pai-----";
        for (int i = 0; i < grafo.getV(); i++) {
            linha += " | " + pai[i];
        }

        return linha;
    }

    
}
