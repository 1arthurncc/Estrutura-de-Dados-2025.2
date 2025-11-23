public class BuscaLargura {
    private static final int BRANCO = 0;
    private static final int CINZA = 1;
    private static final int PRETO = 2;

    int cor[], dist[], pai[];
    private Grafo g;

    BuscaLargura(Grafo g){
        this.g = g;
        cor = new int[g.getV()];
        dist= new int[g.getV()];
        pai = new int[g.getV()];
    }

    void busca(int origem){
        for (int i = 0; i < g.getV(); i++){
            cor[i] = BRANCO;
            dist[i] = -1;
            pai[i] = -1;
        }
        cor[origem] = CINZA; 
        dist[origem] = 0;

        FilaEncadeada fila = new FilaEncadeada();
        fila.insereFila(origem);

        while (!fila.filaVazia()){
            int u = fila.removeFila();
            for (int v = 0; v < this.g.getV(); v++){
                if (cor[v] == BRANCO){
                    cor[v] = CINZA;
                    dist[v] = dist[u] + 1;
                    pai[v] = u;
                    fila.insereFila(v);
                }
            cor[u] = PRETO;
            }
        }
    }

    void imprimeVetores(){
        
        System.out.println("Cores");
        for (int i = 0; i < this.g.getV(); i++)
            System.out.print(cor[i] + " | ");
        System.out.println();

        System.out.println("Pai");
        for (int i = 0; i < this.g.getV(); i++)
            System.out.print(pai[i] + " | ");
        System.out.println();

        System.out.println("Distância");
        for (int i = 0; i < this.g.getV(); i++)
            System.out.print(dist[i] + " | ");
        System.out.println();
    }

    void imprimeCaminho(int destino){
        PilhaEncadeada pi = new PilhaEncadeada();
        pi.empilhar(destino);
        int i = destino;
        while (pai[i] != - 1){
            pi.empilhar(pai[i]);
            i = pai[i];
        }

        while (!pi.vazia()){
            System.out.print(pi.desempilhar() + " -> ");
        }
        System.out.println();
    }
}
