public class Grafo {
    private int V;
    private int mat[][];

    Grafo(int v){
        this.V = v;
        mat = new int[v][v];
        for (int i = 0; i < v; i++){
            for (int j = 0; j < v; j++){
                mat[i][j] = 0;
            }
        }
    }

    void adicionaAresta(int v1, int v2){
        if (v1 < this.V && v2 < this.V && v1 >= 0 && v2 >=0){
            mat[v1][v2] = 1;
            mat[v2][v1] = 1;
        }
    }

    void imprime(){
        for (int i = 0; i < this.V; i++){
            for (int j = 0; j < this.V; j++){
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }
    }

    boolean isAresta(int v1, int v2){
        if (v1 < this.V && v2 < this.V && v1 >= 0 && v2 >=0)
            return mat[v1][v2] == 1;
        return false;
    }

    int getV(){
        return this.V;
    }
}
